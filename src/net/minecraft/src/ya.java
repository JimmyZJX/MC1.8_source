package net.minecraft.src;
/*  1:   */ import io.netty.util.internal.ThreadLocalRandom;
/*  2:   */ import java.util.UUID;
/*  3:   */ import org.apache.commons.lang3.Validate;
/*  4:   */ 
/*  5:   */ public class ya
/*  6:   */ {
/*  7:   */   private final double a;
/*  8:   */   private final int b;
/*  9:   */   private final String c;
/* 10:   */   private final UUID d;
/* 11:19 */   private boolean e = true;
/* 12:   */   
/* 13:   */   public ya(String paramString, double paramDouble, int paramInt)
/* 14:   */   {
/* 15:22 */     this(MathUtils.a(ThreadLocalRandom.current()), paramString, paramDouble, paramInt);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public ya(UUID paramUUID, String paramString, double paramDouble, int paramInt)
/* 19:   */   {
/* 20:26 */     this.d = paramUUID;
/* 21:27 */     this.c = paramString;
/* 22:28 */     this.a = paramDouble;
/* 23:29 */     this.b = paramInt;
/* 24:   */     
/* 25:31 */     Validate.notEmpty(paramString, "Modifier name cannot be empty", new Object[0]);
/* 26:32 */     Validate.inclusiveBetween(0L, 2L, paramInt, "Invalid operation");
/* 27:   */   }
/* 28:   */   
/* 29:   */   public UUID a()
/* 30:   */   {
/* 31:36 */     return this.d;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String b()
/* 35:   */   {
/* 36:40 */     return this.c;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public int c()
/* 40:   */   {
/* 41:44 */     return this.b;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public double d()
/* 45:   */   {
/* 46:48 */     return this.a;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public boolean e()
/* 50:   */   {
/* 51:52 */     return this.e;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public ya a(boolean paramBoolean)
/* 55:   */   {
/* 56:56 */     this.e = paramBoolean;
/* 57:57 */     return this;
/* 58:   */   }
/* 59:   */   
/* 60:   */   public boolean equals(Object paramObject)
/* 61:   */   {
/* 62:62 */     if (this == paramObject) {
/* 63:63 */       return true;
/* 64:   */     }
/* 65:65 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 66:66 */       return false;
/* 67:   */     }
/* 68:69 */     ya localya = (ya)paramObject;
/* 69:71 */     if (this.d != null ? !this.d.equals(localya.d) : localya.d != null) {
/* 70:72 */       return false;
/* 71:   */     }
/* 72:75 */     return true;
/* 73:   */   }
/* 74:   */   
/* 75:   */   public int hashCode()
/* 76:   */   {
/* 77:80 */     return this.d != null ? this.d.hashCode() : 0;
/* 78:   */   }
/* 79:   */   
/* 80:   */   public String toString()
/* 81:   */   {
/* 82:85 */     return "AttributeModifier{amount=" + this.a + ", operation=" + this.b + ", name='" + this.c + '\'' + ", id=" + this.d + ", serialize=" + this.e + '}';
/* 83:   */   }
/* 84:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ya
 * JD-Core Version:    0.7.0.1
 */