package net.minecraft.src;
/*  1:   */ import java.lang.reflect.ParameterizedType;
/*  2:   */ import java.lang.reflect.Type;
/*  3:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ final class btp
/*  6:   */   implements ParameterizedType
/*  7:   */ {
/*  8:   */   public Type[] getActualTypeArguments()
/*  9:   */   {
/* 10:40 */     return new Type[] { String.class };
/* 11:   */   }
/* 12:   */   
/* 13:   */   public Type getRawType()
/* 14:   */   {
/* 15:47 */     return List.class;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public Type getOwnerType()
/* 19:   */   {
/* 20:52 */     return null;
/* 21:   */   }
/* 22:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     btp
 * JD-Core Version:    0.7.0.1
 */