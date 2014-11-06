package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.LinkedHashMap;
/*   3:    */ import java.util.Map;
/*   4:    */ 
/*   5:    */ class clh
/*   6:    */   extends cnc
/*   7:    */ {
/*   8:    */   clh(clc paramclc) {}
/*   9:    */   
/*  10:    */   protected cxl a(Block parambec)
/*  11:    */   {
/*  12:223 */     LinkedHashMap localLinkedHashMap = Maps.newLinkedHashMap(parambec.b());
/*  13:    */     
/*  14:225 */     String str = BlockDirt.a.a((Comparable)localLinkedHashMap.remove(BlockDirt.a));
/*  15:227 */     if (avd.c != parambec.getProperty(BlockDirt.a)) {
/*  16:228 */       localLinkedHashMap.remove(BlockDirt.b);
/*  17:    */     }
/*  18:230 */     return new cxl(str, a(localLinkedHashMap));
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     clh
 * JD-Core Version:    0.7.0.1
 */