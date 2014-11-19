package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonParseException;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class bdj
/*   5:    */   extends bcm
/*   6:    */ {
/*   7: 19 */   public final ho[] a = { new hy(""), new hy(""), new hy(""), new hy("") };
/*   8: 22 */   public int f = -1;
/*   9: 23 */   private boolean g = true;
/*  10:    */   private EntityPlayer h;
/*  11: 25 */   private final af i = new af();
/*  12:    */   
/*  13:    */   public void writeToNBT(NBTTagCompound paramfn)
/*  14:    */   {
/*  15: 29 */     super.writeToNBT(paramfn);
/*  16: 30 */     for (int j = 0; j < 4; j++)
/*  17:    */     {
/*  18: 31 */       String str = hp.a(this.a[j]);
/*  19: 32 */       paramfn.setString("Text" + (j + 1), str);
/*  20:    */     }
/*  21: 34 */     this.i.b(paramfn);
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void readFromNBT(NBTTagCompound paramfn)
/*  25:    */   {
/*  26: 39 */     this.g = false;
/*  27: 40 */     super.readFromNBT(paramfn);
/*  28:    */     
/*  29: 42 */     bdk localbdk = new bdk(this);
/*  30: 92 */     for (int j = 0; j < 4; j++)
/*  31:    */     {
/*  32: 93 */       String str = paramfn.getString("Text" + (j + 1));
/*  33:    */       try
/*  34:    */       {
/*  35: 95 */         ho localho = hp.a(str);
/*  36:    */         try
/*  37:    */         {
/*  38: 97 */           this.a[j] = hq.a(localbdk, localho, null);
/*  39:    */         }
/*  40:    */         catch (CommandException localdi)
/*  41:    */         {
/*  42: 99 */           this.a[j] = localho;
/*  43:    */         }
/*  44:    */       }
/*  45:    */       catch (JsonParseException localJsonParseException)
/*  46:    */       {
/*  47:102 */         this.a[j] = new hy(str);
/*  48:    */       }
/*  49:    */     }
/*  50:105 */     this.i.a(paramfn);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public id x_()
/*  54:    */   {
/*  55:110 */     ho[] arrayOfho = new ho[4];
/*  56:111 */     System.arraycopy(this.a, 0, arrayOfho, 0, 4);
/*  57:112 */     return new ll(this.world, this.pos, arrayOfho);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean b()
/*  61:    */   {
/*  62:116 */     return this.g;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void a(boolean paramBoolean)
/*  66:    */   {
/*  67:120 */     this.g = paramBoolean;
/*  68:121 */     if (!paramBoolean) {
/*  69:122 */       this.h = null;
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(EntityPlayer paramahd)
/*  74:    */   {
/*  75:127 */     this.h = paramahd;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public EntityPlayer c()
/*  79:    */   {
/*  80:131 */     return this.h;
/*  81:    */   }
/*  82:    */   
/*  83:    */   public boolean b(EntityPlayer paramahd)
/*  84:    */   {
/*  85:135 */     bdl localbdl = new bdl(this, paramahd);
/*  86:186 */     for (int j = 0; j < this.a.length; j++)
/*  87:    */     {
/*  88:187 */       hv localhv = this.a[j] == null ? null : this.a[j].b();
/*  89:188 */       if ((localhv != null) && (localhv.h() != null))
/*  90:    */       {
/*  91:192 */         hm localhm = localhv.h();
/*  92:193 */         if (localhm.a() == hn.c) {
/*  93:194 */           MinecraftServer.M().O().a(localbdl, localhm.b());
/*  94:    */         }
/*  95:    */       }
/*  96:    */     }
/*  97:197 */     return true;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public af d()
/* 101:    */   {
/* 102:201 */     return this.i;
/* 103:    */   }
				static af a(bdj parambdj) {return parambdj.i;}
/* 104:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bdj
 * JD-Core Version:    0.7.0.1
 */