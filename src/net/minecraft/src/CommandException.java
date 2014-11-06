package net.minecraft.src;
/*  1:   */ public class CommandException
/*  2:   */   extends Exception
/*  3:   */ {
/*  4:   */   private final Object[] a;
/*  5:   */   
/*  6:   */   public CommandException(String paramString, Object... paramVarArgs)
/*  7:   */   {
/*  8: 7 */     super(paramString);
/*  9:   */     
/* 10: 9 */     this.a = paramVarArgs;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public Object[] a()
/* 14:   */   {
/* 15:13 */     return this.a;
/* 16:   */   }
/* 17:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     di
 * JD-Core Version:    0.7.0.1
 */