package net.minecraft.src;
/*  1:   */ public class kp
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   private EnumDifficulty b;
/*  6:   */   private EnumGameMode c;
/*  7:   */   private WorldType d;
/*  8:   */   
/*  9:   */   public kp() {}
/* 10:   */   
/* 11:   */   public kp(int paramInt, EnumDifficulty paramvt, WorldType paramare, EnumGameMode paramarc)
/* 12:   */   {
/* 13:23 */     this.a = paramInt;
/* 14:24 */     this.b = paramvt;
/* 15:25 */     this.c = paramarc;
/* 16:26 */     this.d = paramare;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(ik paramik)
/* 20:   */   {
/* 21:31 */     paramik.a(this);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 25:   */   {
/* 26:36 */     this.a = paramhd.readInt();
/* 27:37 */     this.b = EnumDifficulty.a(paramhd.readUnsignedByte());
/* 28:38 */     this.c = EnumGameMode.a(paramhd.readUnsignedByte());
/* 29:39 */     this.d = WorldType.parseWorldType(paramhd.c(16));
/* 30:40 */     if (this.d == null) {
/* 31:41 */       this.d = WorldType.DEFAULT;
/* 32:   */     }
/* 33:   */   }
/* 34:   */   
/* 35:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 36:   */   {
/* 37:47 */     paramhd.writeInt(this.a);
/* 38:48 */     paramhd.writeByte(this.b.a());
/* 39:49 */     paramhd.writeByte(this.c.a());
/* 40:50 */     paramhd.a(this.d.a());
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int a()
/* 44:   */   {
/* 45:54 */     return this.a;
/* 46:   */   }
/* 47:   */   
/* 48:   */   public EnumDifficulty b()
/* 49:   */   {
/* 50:58 */     return this.b;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public EnumGameMode c()
/* 54:   */   {
/* 55:62 */     return this.c;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public WorldType d()
/* 59:   */   {
/* 60:66 */     return this.d;
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kp
 * JD-Core Version:    0.7.0.1
 */