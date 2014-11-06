package net.minecraft.src;
/*   1:    */ import java.lang.reflect.ParameterizedType;
/*   2:    */ import java.lang.reflect.Type;
/*   3:    */ import java.util.List;
/*   4:    */ 
/*   5:    */ final class sa
/*   6:    */   implements ParameterizedType
/*   7:    */ {
/*   8:    */   public Type[] getActualTypeArguments()
/*   9:    */   {
/*  10:265 */     return new Type[] { sb.class };
/*  11:    */   }
/*  12:    */   
/*  13:    */   public Type getRawType()
/*  14:    */   {
/*  15:270 */     return List.class;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public Type getOwnerType()
/*  19:    */   {
/*  20:275 */     return null;
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     sa
 * JD-Core Version:    0.7.0.1
 */