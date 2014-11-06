package net.minecraft.src;
/*  1:   */ public class cic
/*  2:   */   implements chc
/*  3:   */ {
/*  4:   */   public cgw a(int paramInt, World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs)
/*  5:   */   {
/*  6:19 */     Block localbec = ProtoBlock.d(paramVarArgs[0]);
/*  7:20 */     if (localbec.getProto().b() == -1) {
/*  8:21 */       return null;
/*  9:   */     }
/* 10:23 */     return new cib(paramaqu, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, localbec).l();
/* 11:   */   }
/* 12:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cic
 * JD-Core Version:    0.7.0.1
 */