package net.minecraft.src;
/*  1:   */ import org.apache.commons.lang3.Validate;
/*  2:   */ 
/*  3:   */ public class eh<K,V>
/*  4:   */   extends ev<K,V>
/*  5:   */ {
/*  6:   */   private final K d;
/*  7:   */   private V e;
/*  8:   */   
/*  9:   */   public eh(K paramObject)
/* 10:   */   {
/* 11:12 */     this.d = paramObject;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void a(int paramInt, K paramObject1, V paramObject2)
/* 15:   */   {
/* 16:17 */     if (this.d.equals(paramObject1)) {
/* 17:18 */       this.e = paramObject2;
/* 18:   */     }
/* 19:21 */     super.a(paramInt, paramObject1, paramObject2);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a()
/* 23:   */   {
/* 24:25 */     Validate.notNull(this.d);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public V a(K paramObject)
/* 28:   */   {
/* 29:30 */     V localObject = super.a(paramObject);
/* 30:31 */     return localObject == null ? this.e : localObject;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public V a(int paramInt)
/* 34:   */   {
/* 35:37 */     V localObject = super.a(paramInt);
/* 36:38 */     return localObject == null ? this.e : localObject;
/* 37:   */   }
/* 38:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     eh
 * JD-Core Version:    0.7.0.1
 */