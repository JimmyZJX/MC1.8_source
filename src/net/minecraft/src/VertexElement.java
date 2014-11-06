package net.minecraft.src;
/*   1:    */ import org.apache.logging.log4j.LogManager;
/*   2:    */ import org.apache.logging.log4j.Logger;
/*   3:    */ 
/*   4:    */ public class VertexElement
/*   5:    */ {
/*   6:  8 */   private static final Logger a = LogManager.getLogger();
/*   7:    */   private final cuv valueType;
/*   8:    */   private final EnumVertexElementType type;
/*   9:    */   private int d;
/*  10:    */   private int count;
/*  11:    */   private int pointer;
/*  12:    */   
/*  13:    */   public VertexElement(int paramInt1, cuv paramcuv, EnumVertexElementType type, int paramInt2)
/*  14:    */   {
/*  15: 17 */     if (!a(paramInt1, type))
/*  16:    */     {
/*  17: 18 */       a.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
/*  18: 19 */       this.type = EnumVertexElementType.UV;
/*  19:    */     }
/*  20:    */     else
/*  21:    */     {
/*  22: 21 */       this.type = type;
/*  23:    */     }
/*  24: 24 */     this.valueType = paramcuv;
/*  25: 25 */     this.d = paramInt1;
/*  26: 26 */     this.count = paramInt2;
/*  27: 27 */     this.pointer = 0;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void setPointer(int paramInt)
/*  31:    */   {
/*  32: 31 */     this.pointer = paramInt;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public int getPointer()
/*  36:    */   {
/*  37: 35 */     return this.pointer;
/*  38:    */   }
/*  39:    */   
/*  40:    */   private final boolean a(int paramInt, EnumVertexElementType paramcuw)
/*  41:    */   {
/*  42: 39 */     return (paramInt == 0) || (paramcuw == EnumVertexElementType.UV);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public final cuv getValueType()
/*  46:    */   {
/*  47: 43 */     return this.valueType;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public final EnumVertexElementType getType()
/*  51:    */   {
/*  52: 47 */     return this.type;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public final int getCount()
/*  56:    */   {
/*  57: 51 */     return this.count;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public final int e()
/*  61:    */   {
/*  62: 55 */     return this.d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public String toString()
/*  66:    */   {
/*  67: 60 */     return this.count + "," + this.type.a() + "," + this.valueType.b();
/*  68:    */   }
/*  69:    */   
/*  70:    */   public final int getSize()
/*  71:    */   {
/*  72: 64 */     return this.valueType.getSize() * this.count;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public final boolean isPosition()
/*  76:    */   {
/*  77: 68 */     return this.type == EnumVertexElementType.POSITION;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean equals(Object paramObject)
/*  81:    */   {
/*  82: 73 */     if (this == paramObject) {
/*  83: 74 */       return true;
/*  84:    */     }
/*  85: 76 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/*  86: 77 */       return false;
/*  87:    */     }
/*  88: 80 */     VertexElement localcuu = (VertexElement)paramObject;
/*  89: 82 */     if (this.count != localcuu.count) {
/*  90: 83 */       return false;
/*  91:    */     }
/*  92: 85 */     if (this.d != localcuu.d) {
/*  93: 86 */       return false;
/*  94:    */     }
/*  95: 88 */     if (this.pointer != localcuu.pointer) {
/*  96: 89 */       return false;
/*  97:    */     }
/*  98: 91 */     if (this.valueType != localcuu.valueType) {
/*  99: 92 */       return false;
/* 100:    */     }
/* 101: 94 */     if (this.type != localcuu.type) {
/* 102: 95 */       return false;
/* 103:    */     }
/* 104: 98 */     return true;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public int hashCode()
/* 108:    */   {
/* 109:103 */     int i = this.valueType.hashCode();
/* 110:104 */     i = 31 * i + this.type.hashCode();
/* 111:105 */     i = 31 * i + this.d;
/* 112:106 */     i = 31 * i + this.count;
/* 113:107 */     i = 31 * i + this.pointer;
/* 114:108 */     return i;
/* 115:    */   }
/* 116:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cuu
 * JD-Core Version:    0.7.0.1
 */