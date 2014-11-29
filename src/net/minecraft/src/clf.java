package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.LinkedHashMap;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class clf
/*   6:    */   extends cnc
/*   7:    */ {
/*   8:    */   clf(clc paramclc) {}
/*   9:    */   
/*  10:    */   protected cxl a(Block parambec)
/*  11:    */   {
/*  12:199 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/*  13:201 */     if (parambec.getData(bay.b) != EnumDirection.UP) {
/*  14:202 */       localLinkedHashMap.remove(bay.a);
/*  15:    */     }
/*  16:204 */     return new cxl((oa)BlockType.c.c(parambec.getType()), a(localLinkedHashMap));
/*  17:    */   }
/*  18:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clf
 * JD-Core Version:    0.7.0.1
 */