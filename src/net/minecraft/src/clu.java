package net.minecraft.src;
/*  1:   */ import java.util.Map;
/*  2:   */ import java.util.Map.Entry;
/*  3:   */ import javax.vecmath.Vector3f;
/*  4:   */ 
/*  5:   */ public class clu
/*  6:   */ {
/*  7:   */   public final Vector3f a;
/*  8:   */   public final Vector3f b;
/*  9:   */   public final Map<EnumDirection,clx> c;
/* 10:   */   public final clz d;
/* 11:   */   public final boolean e;
/* 12:   */   
/* 13:   */   public clu(Vector3f paramVector3f1, Vector3f paramVector3f2, Map<EnumDirection,clx> paramMap, clz paramclz, boolean paramBoolean)
/* 14:   */   {
/* 15:27 */     this.a = paramVector3f1;
/* 16:28 */     this.b = paramVector3f2;
/* 17:29 */     this.c = paramMap;
/* 18:30 */     this.d = paramclz;
/* 19:31 */     this.e = paramBoolean;
/* 20:   */     
/* 21:33 */     a();
/* 22:   */   }
/* 23:   */   
/* 24:   */   private void a()
/* 25:   */   {
/* 26:37 */     for (Map.Entry<EnumDirection,clx> localEntry : this.c.entrySet())
/* 27:   */     {
/* 28:38 */       float[] arrayOfFloat = a((EnumDirection)localEntry.getKey());
/* 29:39 */       ((clx)localEntry.getValue()).e.a(arrayOfFloat);
/* 30:   */     }
/* 31:   */   }
/* 32:   */   
/* 33:   */   private float[] a(EnumDirection paramej)
/* 34:   */   {
/* 35:   */     float[] arrayOfFloat;
/* 36:45 */     switch (clv.a[paramej.ordinal()])
/* 37:   */     {
/* 38:   */     case 1: 
/* 39:   */     case 2: 
/* 40:48 */       arrayOfFloat = new float[] { this.a.x, this.a.z, this.b.x, this.b.z };
/* 41:49 */       break;
/* 42:   */     case 3: 
/* 43:   */     case 4: 
/* 44:52 */       arrayOfFloat = new float[] { this.a.x, 16.0F - this.b.y, this.b.x, 16.0F - this.a.y };
/* 45:53 */       break;
/* 46:   */     case 5: 
/* 47:   */     case 6: 
/* 48:56 */       arrayOfFloat = new float[] { this.a.z, 16.0F - this.b.y, this.b.z, 16.0F - this.a.y };
/* 49:57 */       break;
/* 50:   */     default: 
/* 51:59 */       throw new NullPointerException();
/* 52:   */     }
/* 53:61 */     return arrayOfFloat;
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clu
 * JD-Core Version:    0.7.0.1
 */