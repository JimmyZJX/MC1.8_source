package net.minecraft.src;
/*   1:    */ public enum EnumVertexElementType
/*   2:    */ { POSITION("Position"),
				NORMAL("Normal"),
				COLOR("Vertex Color"),
				UV("UV"),
				MATRIX("Bone Matrix"),
				BLEND_WEIGHT("Blend Weight"),
				PADDING("Padding");
/*   3:    */   private final String h;
/*   4:    */   
/*   5:    */   private EnumVertexElementType(String paramString)
/*   6:    */   {
/*   7:123 */     this.h = paramString;
/*   8:    */   }
/*   9:    */   
/*  10:    */   public String a()
/*  11:    */   {
/*  12:127 */     return this.h;
/*  13:    */   }
/*  14:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuw
 * JD-Core Version:    0.7.0.1
 */