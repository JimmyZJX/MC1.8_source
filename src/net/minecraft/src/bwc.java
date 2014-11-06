package net.minecraft.src;
/*  1:   */ import java.net.InetAddress;
/*  2:   */ import java.net.UnknownHostException;
/*  4:   */ 
/*  5:   */ class bwc
/*  6:   */   extends Thread
/*  7:   */ {
			  private final String a;
			  private final int b;
			  private final bwb c;
/*  8:   */   bwc(bwb parambwb, String paramString1, String paramString2, int paramInt)
/*  9:   */   {
/* 10:50 */     super(paramString1);
				a=paramString2;b=paramInt;c=parambwb;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void run()
/* 14:   */   {
/* 15:53 */     InetAddress localInetAddress = null;
/* 16:   */     try
/* 17:   */     {
/* 18:55 */       if (bwb.a(this.c)) {
/* 19:56 */         return;
/* 20:   */       }
/* 21:58 */       localInetAddress = InetAddress.getByName(this.a);
/* 22:59 */       bwb.a(this.c, gr.a(localInetAddress, this.b));
/* 23:60 */       bwb.b(this.c).a(new cec(bwb.b(this.c), this.c.j, bwb.c(this.c)));
/* 24:61 */       bwb.b(this.c).a(new mz(47, this.a, this.b, gy.d));
/* 25:62 */       bwb.b(this.c).a(new ni(this.c.j.K().e()));
/* 26:   */     }
/* 27:   */     catch (UnknownHostException localUnknownHostException)
/* 28:   */     {
/* 29:64 */       if (bwb.a(this.c)) {
/* 30:65 */         return;
/* 31:   */       }
/* 32:67 */       bwb.a().error("Couldn't connect to server", localUnknownHostException);
/* 33:68 */       this.c.j.a(new bwo(bwb.c(this.c), "connect.failed", new hz("disconnect.genericReason", new Object[] { "Unknown host" })));
/* 34:   */     }
/* 35:   */     catch (Exception localException)
/* 36:   */     {
/* 37:70 */       if (bwb.a(this.c)) {
/* 38:71 */         return;
/* 39:   */       }
/* 40:73 */       bwb.a().error("Couldn't connect to server", localException);
/* 41:74 */       String str1 = localException.toString();
/* 42:75 */       if (localInetAddress != null)
/* 43:   */       {
/* 44:76 */         String str2 = localInetAddress.toString() + ":" + this.b;
/* 45:77 */         str1 = str1.replaceAll(str2, "");
/* 46:   */       }
/* 47:79 */       this.c.j.a(new bwo(bwb.c(this.c), "connect.failed", new hz("disconnect.genericReason", new Object[] { str1 })));
/* 48:   */     }
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bwc
 * JD-Core Version:    0.7.0.1
 */