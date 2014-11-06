package net.minecraft.src;
/*  1:   */ import java.net.InetAddress;
/*  2:   */ import java.net.UnknownHostException;
/*  3:   */ import net.minecraft.realms.DisconnectedRealmsScreen;
/*  4:   */ import net.minecraft.realms.Realms;
/*  5:   */ import net.minecraft.realms.RealmsConnect;
/*  8:   */ 
/*  9:   */ public class dav
/* 10:   */   extends Thread
/* 11:   */ {
			  private final String a;
			  private final int b;
			  private final RealmsConnect c;
/* 12:   */   public dav(RealmsConnect paramRealmsConnect, String paramString1, String paramString2, int paramInt)
/* 13:   */   {
/* 14:29 */     super(paramString1);
				a=paramString2;b=paramInt;c=paramRealmsConnect;
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void run()
/* 18:   */   {
/* 19:32 */     InetAddress localInetAddress = null;
/* 20:   */     try
/* 21:   */     {
/* 22:34 */       localInetAddress = InetAddress.getByName(this.a);
/* 23:35 */       if (RealmsConnect.access$000(this.c)) {
/* 24:36 */         return;
/* 25:   */       }
/* 26:38 */       RealmsConnect.access$102(this.c, gr.a(localInetAddress, this.b));
/* 27:39 */       if (RealmsConnect.access$000(this.c)) {
/* 28:40 */         return;
/* 29:   */       }
/* 30:42 */       RealmsConnect.access$100(this.c).a(new cec(RealmsConnect.access$100(this.c), bsu.z(), RealmsConnect.access$200(this.c).getProxy()));
/* 31:43 */       if (RealmsConnect.access$000(this.c)) {
/* 32:44 */         return;
/* 33:   */       }
/* 34:46 */       RealmsConnect.access$100(this.c).a(new mz(47, this.a, this.b, gy.d));
/* 35:47 */       if (RealmsConnect.access$000(this.c)) {
/* 36:48 */         return;
/* 37:   */       }
/* 38:50 */       RealmsConnect.access$100(this.c).a(new ni(bsu.z().K().e()));
/* 39:   */     }
/* 40:   */     catch (UnknownHostException localUnknownHostException)
/* 41:   */     {
/* 42:52 */       if (RealmsConnect.access$000(this.c)) {
/* 43:53 */         return;
/* 44:   */       }
/* 45:55 */       RealmsConnect.access$300().error("Couldn't connect to world", localUnknownHostException);
/* 46:56 */       Realms.setScreen(new DisconnectedRealmsScreen(RealmsConnect.access$200(this.c), "connect.failed", new hz("disconnect.genericReason", new Object[] { "Unknown host '" + this.a + "'" })));
/* 47:   */     }
/* 48:   */     catch (Exception localException)
/* 49:   */     {
/* 50:58 */       if (RealmsConnect.access$000(this.c)) {
/* 51:59 */         return;
/* 52:   */       }
/* 53:61 */       RealmsConnect.access$300().error("Couldn't connect to world", localException);
/* 54:62 */       String str1 = localException.toString();
/* 55:63 */       if (localInetAddress != null)
/* 56:   */       {
/* 57:64 */         String str2 = localInetAddress.toString() + ":" + this.b;
/* 58:65 */         str1 = str1.replaceAll(str2, "");
/* 59:   */       }
/* 60:67 */       Realms.setScreen(new DisconnectedRealmsScreen(RealmsConnect.access$200(this.c), "connect.failed", new hz("disconnect.genericReason", new Object[] { str1 })));
/* 61:   */     }
/* 62:   */   }
/* 63:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dav
 * JD-Core Version:    0.7.0.1
 */