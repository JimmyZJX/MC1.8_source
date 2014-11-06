package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import org.apache.commons.lang3.ArrayUtils;
/*   4:    */ 
/*   5:    */ class cfa
/*   6:    */   implements nm
/*   7:    */ {
			    private final cew a;
			    private final gr b;
			    private final cez c;
/*   8: 51 */   private boolean d = false;
/*   9: 52 */   private long e = 0L;
/*  10:    */   
/*  11:    */   cfa(cez paramcez, cew paramcew, gr paramgr) {a=paramcew;b=paramgr;c=paramcez;}
/*  12:    */   
/*  13:    */   public void a(no paramno)
/*  14:    */   {
/*  15: 55 */     np localnp = paramno.a();
/*  16: 57 */     if (localnp.a() != null) {
/*  17: 58 */       this.a.d = localnp.a().d();
/*  18:    */     } else {
/*  19: 60 */       this.a.d = "";
/*  20:    */     }
/*  21: 63 */     if (localnp.c() != null)
/*  22:    */     {
/*  23: 64 */       this.a.g = localnp.c().a();
/*  24: 65 */       this.a.f = localnp.c().b();
/*  25:    */     }
/*  26:    */     else
/*  27:    */     {
/*  28: 67 */       this.a.g = "Old";
/*  29: 68 */       this.a.f = 0;
/*  30:    */     }
/*  31:    */     Object localObject;
/*  32: 71 */     if (localnp.b() != null)
/*  33:    */     {
/*  34: 72 */       this.a.c = (a.h + "" + localnp.b().b() + "" + a.i + "/" + a.h + localnp.b().a());
/*  35: 74 */       if (ArrayUtils.isNotEmpty(localnp.b().c()))
/*  36:    */       {
/*  37: 75 */         localObject = new StringBuilder();
/*  38: 76 */         for (GameProfile localGameProfile : localnp.b().c())
/*  39:    */         {
/*  40: 77 */           if (((StringBuilder)localObject).length() > 0) {
/*  41: 78 */             ((StringBuilder)localObject).append("\n");
/*  42:    */           }
/*  43: 80 */           ((StringBuilder)localObject).append(localGameProfile.getName());
/*  44:    */         }
/*  45: 82 */         if (localnp.b().c().length < localnp.b().b())
/*  46:    */         {
/*  47: 83 */           if (((StringBuilder)localObject).length() > 0) {
/*  48: 84 */             ((StringBuilder)localObject).append("\n");
/*  49:    */           }
/*  50: 86 */           ((StringBuilder)localObject).append("... and ").append(localnp.b().b() - localnp.b().c().length).append(" more ...");
/*  51:    */         }
/*  52: 88 */         this.a.i = ((StringBuilder)localObject).toString();
/*  53:    */       }
/*  54:    */     }
/*  55:    */     else
/*  56:    */     {
/*  57: 91 */       this.a.c = (a.i + "???");
/*  58:    */     }
/*  59: 94 */     if (localnp.d() != null)
/*  60:    */     {
/*  61: 95 */       localObject = localnp.d();
/*  62: 96 */       if (((String)localObject).startsWith("data:image/png;base64,")) {
/*  63: 97 */         this.a.a(((String)localObject).substring("data:image/png;base64,".length()));
/*  64:    */       } else {
/*  65: 99 */         cez.c().error("Invalid server icon (unknown format)");
/*  66:    */       }
/*  67:    */     }
/*  68:    */     else
/*  69:    */     {
/*  70:102 */       this.a.a((String)null);
/*  71:    */     }
/*  72:105 */     this.e = bsu.I();
/*  73:106 */     this.b.a(new nw(this.e));
/*  74:107 */     this.d = true;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void a(nn paramnn)
/*  78:    */   {
/*  79:112 */     long l1 = this.e;
/*  80:113 */     long l2 = bsu.I();
/*  81:114 */     this.a.e = (l2 - l1);
/*  82:    */     
/*  83:116 */     this.b.a(new hy("Finished"));
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void a(ho paramho)
/*  87:    */   {
/*  88:121 */     if (!this.d)
/*  89:    */     {
/*  90:122 */       cez.c().error("Can't ping " + this.a.b + ": " + paramho.c());
/*  91:123 */       this.a.d = (a.e + "Can't connect to server.");
/*  92:124 */       this.a.c = "";
/*  93:    */       
/*  94:126 */       cez.a(this.c, this.a);
/*  95:    */     }
/*  96:    */   }
/*  97:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cfa
 * JD-Core Version:    0.7.0.1
 */