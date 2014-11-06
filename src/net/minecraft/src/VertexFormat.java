package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ import org.apache.logging.log4j.LogManager;
/*   4:    */ import org.apache.logging.log4j.Logger;
/*   5:    */ 
/*   6:    */ public class VertexFormat
/*   7:    */ {
/*   8: 10 */   private static final Logger a = LogManager.getLogger();
/*   9: 12 */   private final List<VertexElement> elements = Lists.newArrayList();
/*  10: 13 */   private final List<Integer> pointers = Lists.newArrayList();
/*  11: 14 */   private int size = 0;
/*  12: 16 */   private int colorPointer = -1;
/*  13: 17 */   private List<Integer> uvPointers = Lists.newArrayList();
/*  14: 18 */   private int normalPointer = -1;
/*  15:    */   
/*  16:    */   public VertexFormat(VertexFormat paramcus)
/*  17:    */   {
/*  18: 21 */     this();
/*  19: 22 */     for (int i = 0; i < paramcus.getElementCount(); i++) {
/*  20: 23 */       addElement(paramcus.getElement(i));
/*  21:    */     }
/*  22: 25 */     this.size = paramcus.getSize();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public VertexFormat() {}
/*  26:    */   
/*  27:    */   public void clear()
/*  28:    */   {
/*  29: 32 */     this.elements.clear();
/*  30: 33 */     this.pointers.clear();
/*  31: 34 */     this.colorPointer = -1;
/*  32: 35 */     this.uvPointers.clear();
/*  33: 36 */     this.normalPointer = -1;
/*  34: 37 */     this.size = 0;
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void addElement(VertexElement element)
/*  38:    */   {
/*  39: 41 */     if ((element.isPosition()) && (hasPosition()))
/*  40:    */     {
/*  41: 42 */       a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
/*  42: 43 */       return;
/*  43:    */     }
/*  44: 46 */     this.elements.add(element);
/*  45: 47 */     this.pointers.add(Integer.valueOf(this.size));
/*  46: 48 */     element.setPointer(this.size);
/*  47: 49 */     this.size += element.getSize();
/*  48: 51 */     switch (cut.a[element.getType().ordinal()])
/*  49:    */     {
/*  50:    */     case 1: 
/*  51: 53 */       this.normalPointer = element.getPointer();
/*  52: 54 */       break;
/*  53:    */     case 2: 
/*  54: 56 */       this.colorPointer = element.getPointer();
/*  55: 57 */       break;
/*  56:    */     case 3: 
/*  57: 59 */       this.uvPointers.add(element.e(), Integer.valueOf(element.getPointer()));
/*  58: 60 */       break;
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean hasNormal()
/*  63:    */   {
/*  64: 68 */     return this.normalPointer >= 0;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public int getNormalPointer()
/*  68:    */   {
/*  69: 72 */     return this.normalPointer;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public boolean hasColor()
/*  73:    */   {
/*  74: 76 */     return this.colorPointer >= 0;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public int getColorPointer()
/*  78:    */   {
/*  79: 80 */     return this.colorPointer;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean hasUV(int paramInt)
/*  83:    */   {
/*  84: 84 */     return this.uvPointers.size() - 1 >= paramInt;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public int getUVPointer(int paramInt)
/*  88:    */   {
/*  89: 88 */     return this.uvPointers.get(paramInt).intValue();
/*  90:    */   }
/*  91:    */   
/*  92:    */   public String toString()
/*  93:    */   {
/*  94: 93 */     String str = "format: " + this.elements.size() + " elements: ";
/*  95: 94 */     for (int i = 0; i < this.elements.size(); i++)
/*  96:    */     {
/*  97: 95 */       str = str + this.elements.get(i).toString();
/*  98: 96 */       if (i != this.elements.size() - 1) {
/*  99: 97 */         str = str + " ";
/* 100:    */       }
/* 101:    */     }
/* 102:100 */     return str;
/* 103:    */   }
/* 104:    */   
/* 105:    */   private boolean hasPosition()
/* 106:    */   {
/* 107:104 */     for (VertexElement element : this.elements) {
/* 108:105 */       if (element.isPosition()) {
/* 109:106 */         return true;
/* 110:    */       }
/* 111:    */     }
/* 112:110 */     return false;
/* 113:    */   }
/* 114:    */   
/* 115:    */   public int getSize()
/* 116:    */   {
/* 117:114 */     return this.size;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public List<VertexElement> getElements()
/* 121:    */   {
/* 122:118 */     return this.elements;
/* 123:    */   }
/* 124:    */   
/* 125:    */   public int getElementCount()
/* 126:    */   {
/* 127:122 */     return this.elements.size();
/* 128:    */   }
/* 129:    */   
/* 130:    */   public VertexElement getElement(int paramInt)
/* 131:    */   {
/* 132:126 */     return this.elements.get(paramInt);
/* 133:    */   }
/* 134:    */   
/* 135:    */   public boolean equals(Object paramObject)
/* 136:    */   {
/* 137:135 */     if (this == paramObject) {
/* 138:136 */       return true;
/* 139:    */     }
/* 140:138 */     if ((paramObject == null) || (getClass() != paramObject.getClass())) {
/* 141:139 */       return false;
/* 142:    */     }
/* 143:142 */     VertexFormat localcus = (VertexFormat)paramObject;
/* 144:144 */     if (this.size != localcus.size) {
/* 145:145 */       return false;
/* 146:    */     }
/* 147:147 */     if (!this.elements.equals(localcus.elements)) {
/* 148:148 */       return false;
/* 149:    */     }
/* 150:150 */     if (!this.pointers.equals(localcus.pointers)) {
/* 151:151 */       return false;
/* 152:    */     }
/* 153:154 */     return true;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public int hashCode()
/* 157:    */   {
/* 158:159 */     int i = this.elements.hashCode();
/* 159:160 */     i = 31 * i + this.pointers.hashCode();
/* 160:161 */     i = 31 * i + this.size;
/* 161:162 */     return i;
/* 162:    */   }
/* 163:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cus
 * JD-Core Version:    0.7.0.1
 */