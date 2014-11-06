package net.minecraft.src;
/*  1:   */ import java.io.IOException;
/*  2:   */ 
/*  3:   */ public class ji
/*  4:   */   implements id<ik>
/*  5:   */ {
/*  6:   */   private String a;
/*  7:   */   private ByteBufWrapper b;
/*  8:   */   
/*  9:   */   public ji() {}
/* 10:   */   
/* 11:   */   public ji(String paramString, ByteBufWrapper paramhd)
/* 12:   */   {
/* 13:26 */     this.a = paramString;
/* 14:27 */     this.b = paramhd;
/* 15:29 */     if (paramhd.writerIndex() > 1048576) {
/* 16:30 */       throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
/* 17:   */     }
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 21:   */   {
/* 22:36 */     this.a = paramhd.c(20);
/* 23:37 */     int i = paramhd.readableBytes();
/* 24:38 */     if ((i < 0) || (i > 1048576)) {
/* 25:39 */       throw new IOException("Payload may not be larger than 1048576 bytes");
/* 26:   */     }
/* 27:41 */     this.b = new ByteBufWrapper(paramhd.readBytes(i));
/* 28:   */   }
/* 29:   */   
/* 30:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 31:   */   {
/* 32:46 */     paramhd.a(this.a);
/* 33:47 */     paramhd.writeBytes(this.b);
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(ik paramik)
/* 37:   */   {
/* 38:52 */     paramik.a(this);
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String a()
/* 42:   */   {
/* 43:56 */     return this.a;
/* 44:   */   }
/* 45:   */   
/* 46:   */   public ByteBufWrapper b()
/* 47:   */   {
/* 48:60 */     return this.b;
/* 49:   */   }
/* 50:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ji
 * JD-Core Version:    0.7.0.1
 */