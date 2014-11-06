package net.minecraft.src;
/*  1:   */ import org.apache.commons.lang3.StringUtils;
/*  2:   */ 
/*  3:   */ public class lt
/*  4:   */   implements id<ls>
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private BlockPosition b;
/*  8:   */   
/*  9:   */   public lt() {}
/* 10:   */   
/* 11:   */   public lt(String paramString)
/* 12:   */   {
/* 13:17 */     this(paramString, null);
/* 14:   */   }
/* 15:   */   
/* 16:   */   public lt(String paramString, BlockPosition paramdt)
/* 17:   */   {
/* 18:21 */     this.a = paramString;
/* 19:22 */     this.b = paramdt;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 23:   */   {
/* 24:27 */     this.a = paramhd.c(32767);
/* 25:28 */     boolean bool = paramhd.readBoolean();
/* 26:29 */     if (bool) {
/* 27:30 */       this.b = paramhd.readBlockPosition();
/* 28:   */     }
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 32:   */   {
/* 33:36 */     paramhd.a(StringUtils.substring(this.a, 0, 32767));
/* 34:37 */     boolean bool = this.b != null;
/* 35:38 */     paramhd.writeBoolean(bool);
/* 36:39 */     if (bool) {
/* 37:40 */       paramhd.writeBlockPosition(this.b);
/* 38:   */     }
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void a(ls paramls)
/* 42:   */   {
/* 43:46 */     paramls.a(this);
/* 44:   */   }
/* 45:   */   
/* 46:   */   public String a()
/* 47:   */   {
/* 48:50 */     return this.a;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public BlockPosition b()
/* 52:   */   {
/* 53:54 */     return this.b;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     lt
 * JD-Core Version:    0.7.0.1
 */