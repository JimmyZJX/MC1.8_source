package net.minecraft.src;
/* 1:  */ public class SyntaxErrorException
/* 2:  */   extends CommandException
/* 3:  */ {
/* 4:  */   public SyntaxErrorException()
/* 5:  */   {
/* 6:5 */     this("commands.generic.snytax", new Object[0]);
/* 7:  */   }
/* 8:  */   
/* 9:  */   public SyntaxErrorException(String paramString, Object... paramVarArgs)
/* ::  */   {
/* ;:9 */     super(paramString, paramVarArgs);
/* <:  */   }
/* =:  */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     dl
 * JD-Core Version:    0.7.0.1
 */