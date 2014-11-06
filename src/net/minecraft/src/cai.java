package net.minecraft.src;
/*   1:    */ import tv.twitch.broadcast.IngestServer;
/*   2:    */ 
/*   3:    */ class cai
/*   4:    */   extends bvk
/*   5:    */ {
				private final cah u;
/*   6:    */   public cai(cah paramcah, bsu parambsu)
/*   7:    */   {
/*   8: 74 */     super(parambsu, paramcah.l, paramcah.m, 32, paramcah.m - 35, (int)(parambsu.k.a * 3.5D));
				  u=paramcah;
/*   9: 75 */     a(false);
/*  10:    */   }
/*  11:    */   
/*  12:    */   protected int b()
/*  13:    */   {
/*  14: 80 */     return this.a.W().s().length;
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected void a(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3)
/*  18:    */   {
/*  19: 85 */     this.a.t.Q = this.a.W().s()[paramInt1].serverUrl;
/*  20: 86 */     this.a.t.b();
/*  21:    */   }
/*  22:    */   
/*  23:    */   protected boolean a(int paramInt)
/*  24:    */   {
/*  25: 91 */     return this.a.W().s()[paramInt].serverUrl.equals(this.a.t.Q);
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void a() {}
/*  29:    */   
/*  30:    */   protected void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*  31:    */   {
/*  32:100 */     IngestServer localIngestServer = this.a.W().s()[paramInt1];
/*  33:101 */     String str1 = localIngestServer.serverUrl.replaceAll("\\{stream_key\\}", "");
/*  34:102 */     String str2 = (int)localIngestServer.bitrateKbps + " kbps";
/*  35:103 */     String str3 = null;
/*  36:104 */     dai localdai = this.a.W().v();
/*  37:106 */     if (localdai != null)
/*  38:    */     {
/*  39:107 */       if (localIngestServer == localdai.c())
/*  40:    */       {
/*  41:108 */         str1 = a.k + str1;
/*  42:109 */         str2 = (int)(localdai.i() * 100.0F) + "%";
/*  43:    */       }
/*  44:110 */       else if (paramInt1 < localdai.d())
/*  45:    */       {
/*  46:111 */         if (localIngestServer.bitrateKbps == 0.0F) {
/*  47:112 */           str2 = a.m + "Down!";
/*  48:    */         }
/*  49:    */       }
/*  50:    */       else
/*  51:    */       {
/*  52:115 */         str2 = a.q + "1234" + a.v + " kbps";
/*  53:    */       }
/*  54:    */     }
/*  55:117 */     else if (localIngestServer.bitrateKbps == 0.0F) {
/*  56:118 */       str2 = a.m + "Down!";
/*  57:    */     }
/*  58:121 */     paramInt2 -= 15;
/*  59:123 */     if (a(paramInt1)) {
/*  60:124 */       str3 = a.j + "(Preferred)";
/*  61:125 */     } else if (localIngestServer.defaultServer) {
/*  62:126 */       str3 = a.k + "(Default)";
/*  63:    */     }
/*  64:129 */     this.u.c(cah.a(this.u), localIngestServer.serverName, paramInt2 + 2, paramInt3 + 5, 16777215);
/*  65:130 */     this.u.c(cah.b(this.u), str1, paramInt2 + 2, paramInt3 + cah.c(this.u).a + 5 + 3, 3158064);
/*  66:131 */     this.u.c(cah.d(this.u), str2, d() - 5 - cah.e(this.u).a(str2), paramInt3 + 5, 8421504);
/*  67:132 */     if (str3 != null) {
/*  68:133 */       this.u.c(cah.f(this.u), str3, d() - 5 - cah.g(this.u).a(str3), paramInt3 + 5 + 3 + cah.h(this.u).a, 8421504);
/*  69:    */     }
/*  70:    */   }
/*  71:    */   
/*  72:    */   protected int d()
/*  73:    */   {
/*  74:139 */     return super.d() + 15;
/*  75:    */   }
/*  76:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cai
 * JD-Core Version:    0.7.0.1
 */