package net.minecraft.src;
/*  1:   */ import javax.vecmath.Vector3f;
/*  2:   */ 
/*  3:   */ public class cmv
/*  4:   */ {
/*  5:12 */   public static final cmv a = new cmv(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
/*  6:   */   public final Vector3f b;
/*  7:   */   public final Vector3f c;
/*  8:   */   public final Vector3f d;
/*  9:   */   
/* 10:   */   public cmv(Vector3f paramVector3f1, Vector3f paramVector3f2, Vector3f paramVector3f3)
/* 11:   */   {
/* 12:19 */     this.b = new Vector3f(paramVector3f1);
/* 13:20 */     this.c = new Vector3f(paramVector3f2);
/* 14:21 */     this.d = new Vector3f(paramVector3f3);
/* 15:   */   }
/* 16:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cmv
 * JD-Core Version:    0.7.0.1
 */