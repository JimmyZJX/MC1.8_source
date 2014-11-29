package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.LinkedHashMap;
/*  3:   */ import java.util.List;
/*  4:   */ import java.util.Map;
/*  5:   */ 
/*  6:   */ public class cnf
/*  7:   */   extends cnc
/*  8:   */ {
/*  9:   */   private final IBlockData a;
/* 10:   */   private final String c;
/* 11:   */   private final List<IBlockData> d;
/* 12:   */   
/* 13:   */   private cnf(IBlockData parambex, String paramString, List<IBlockData> paramList)
/* 14:   */   {
/* 15:21 */     this.a = parambex;
/* 16:22 */     this.c = paramString;
/* 17:23 */     this.d = paramList;
/* 18:   */   }
/* 19:   */   
/* 20:   */   protected cxl a(Block parambec)
/* 21:   */   {
/* 22:28 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/* 23:   */     String str;
/* 24:31 */     if (this.a == null) {
/* 25:32 */       str = ((oa)BlockType.c.c(parambec.getType())).toString();
/* 26:   */     } else {
/* 27:34 */       str = this.a.toString((Comparable)localLinkedHashMap.remove(this.a));
/* 28:   */     }
/* 29:37 */     if (this.c != null) {
/* 30:38 */       str = str + this.c;
/* 31:   */     }
/* 32:41 */     for (IBlockData localbex : this.d) {
/* 33:42 */       localLinkedHashMap.remove(localbex);
/* 34:   */     }
/* 35:45 */     return new cxl(str, a(localLinkedHashMap));
/* 36:   */   }
			  cnf(IBlockData arg0, String arg1, List<IBlockData> arg2, cng arg3) {this(arg0,arg1,arg2);}
/* 37:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnf
 * JD-Core Version:    0.7.0.1
 */