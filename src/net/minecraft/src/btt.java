package net.minecraft.src;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class btt {
	private static final Logger a = LogManager.getLogger();
	private static final DateFormat b = new SimpleDateFormat(
			"yyyy-MM-dd_HH.mm.ss");
	private static IntBuffer c;
	private static int[] d;

	public static ho a(File paramFile, int paramInt1, int paramInt2,
			ckw paramckw) {
		return a(paramFile, null, paramInt1, paramInt2, paramckw);
	}

	public static ho a(File paramFile, String paramString, int paramInt1,
			int paramInt2, ckw paramckw) {
		try {
			File localFile1 = new File(paramFile, "screenshots");
			localFile1.mkdir();
			if (dax.i()) {
				paramInt1 = paramckw.a;
				paramInt2 = paramckw.b;
			}
			int i = paramInt1 * paramInt2;
			if ((c == null) || (c.capacity() < i)) {
				c = BufferUtils.createIntBuffer(i);
				d = new int[i];
			}
			GL11.glPixelStorei(3333, 1);
			GL11.glPixelStorei(3317, 1);

			c.clear();
			if (dax.i()) {
				cjm.i(paramckw.g);
				GL11.glGetTexImage(3553, 0, 32993, 33639, c);
			} else {
				GL11.glReadPixels(0, 0, paramInt1, paramInt2, 32993, 33639, c);
			}
			c.get(d);

			cuj.a(d, paramInt1, paramInt2);

			BufferedImage localBufferedImage = null;
			if (dax.i()) {
				localBufferedImage = new BufferedImage(paramckw.c, paramckw.d,
						1);
				int j = paramckw.b - paramckw.d;
				for (int k = j; k < paramckw.b; k++) {
					for (int m = 0; m < paramckw.c; m++) {
						localBufferedImage.setRGB(m, k - j,
								d[(k * paramckw.a + m)]);
					}
				}
			} else {
				localBufferedImage = new BufferedImage(paramInt1, paramInt2, 1);
				localBufferedImage.setRGB(0, 0, paramInt1, paramInt2, d, 0,
						paramInt1);
			}
			File localFile2;
			if (paramString == null) {
				localFile2 = a(localFile1);
			} else {
				localFile2 = new File(localFile1, paramString);
			}
			ImageIO.write(localBufferedImage, "png", localFile2);

			hy localhy = new hy(localFile2.getName());
			localhy.b().a(new hm(hn.b, localFile2.getAbsolutePath()));
			localhy.b().d(Boolean.valueOf(true));
			return new hz("screenshot.success", new Object[] { localhy });
		} catch (Exception localException) {
			a.warn("Couldn't save screenshot", localException);
			return new hz("screenshot.failure", localException.getMessage());
		}
	}

	private static File a(File paramFile) {
		String str = b.format(new Date()).toString();
		for (int i = 1;; i++) {
			File localFile = new File(paramFile, str
					+ (i == 1 ? "" : new StringBuilder().append("_").append(i)
							.toString()) + ".png");
			if (!localFile.exists()) {
				return localFile;
			}
		}
	}
}

/*
 * Location: C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * 
 * Qualified Name: btt
 * 
 * JD-Core Version: 0.7.0.1
 */