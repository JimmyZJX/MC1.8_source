package net.minecraft.src;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipException;

public abstract interface cvm
{
  public abstract InputStream a(oa paramoa) throws ZipException, IOException;
  
  public abstract boolean b(oa paramoa);
  
  public abstract Set<String> c();
  
  public abstract cwi a(cwk paramcwk, String paramString) throws ZipException, IOException;
  
  public abstract BufferedImage a() throws ZipException, IOException;
  
  public abstract String b();
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvm
 * JD-Core Version:    0.7.0.1
 */