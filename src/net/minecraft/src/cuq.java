package net.minecraft.src;
/*  1:   */ public class cuq
/*  2:   */ {
/*  3: 8 */   public static final VertexFormat a = new VertexFormat();
/*  4:   */   public static final VertexFormat b;
/*  5:   */   
/*  6:   */   static
/*  7:   */   {
/*  8: 9 */     a.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.POSITION, 3));
/*  9:10 */     a.addElement(new VertexElement(0, cuv.UBYTE, EnumVertexElementType.COLOR, 4));
/* 10:11 */     a.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.UV, 2));
/* 11:12 */     a.addElement(new VertexElement(1, cuv.SHORT, EnumVertexElementType.UV, 2));
/* 12:   */     
/* 13:14 */     b = new VertexFormat();
/* 14:15 */     b.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.POSITION, 3));
/* 15:16 */     b.addElement(new VertexElement(0, cuv.UBYTE, EnumVertexElementType.COLOR, 4));
/* 16:17 */     b.addElement(new VertexElement(0, cuv.FLOAT, EnumVertexElementType.UV, 2));
/* 17:18 */     b.addElement(new VertexElement(0, cuv.BYTE, EnumVertexElementType.NORMAL, 3));
/* 18:19 */     b.addElement(new VertexElement(0, cuv.BYTE, EnumVertexElementType.PADDING, 1));
/* 19:   */   }
/* 20:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuq
 * JD-Core Version:    0.7.0.1
 */