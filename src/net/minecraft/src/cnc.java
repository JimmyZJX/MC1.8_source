package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.Map;
/*  3:   */ import java.util.Map.Entry;
/*  4:   */ 
/*  5:   */ public abstract class cnc
/*  6:   */   implements cni
/*  7:   */ {
/*  8:12 */   protected Map<Block,cxl> b = Maps.newLinkedHashMap();
/*  9:   */   
/* 10:   */   public String a(Map<IBlockData,Comparable> paramMap)
/* 11:   */   {
/* 12:15 */     StringBuilder localStringBuilder = new StringBuilder();
/* 13:16 */     for (Map.Entry<IBlockData,Comparable> localEntry : paramMap.entrySet())
/* 14:   */     {
/* 15:17 */       if (localStringBuilder.length() != 0) {
/* 16:18 */         localStringBuilder.append(",");
/* 17:   */       }
/* 18:21 */       IBlockData localbex = (IBlockData)localEntry.getKey();
/* 19:22 */       Comparable localComparable = localEntry.getValue();
/* 20:23 */       localStringBuilder.append(localbex.getName());
/* 21:24 */       localStringBuilder.append("=");
/* 22:25 */       localStringBuilder.append(localbex.toString(localComparable));
/* 23:   */     }
/* 24:28 */     if (localStringBuilder.length() == 0) {
/* 25:29 */       localStringBuilder.append("normal");
/* 26:   */     }
/* 27:32 */     return localStringBuilder.toString();
/* 28:   */   }
/* 29:   */   
/* 30:   */   public Map<Block,cxl> a(BlockType paramatr)
/* 31:   */   {
/* 32:37 */     for (Block localbec : paramatr.O().a()) {
/* 33:38 */       this.b.put(localbec, a(localbec));
/* 34:   */     }
/* 35:40 */     return this.b;
/* 36:   */   }
/* 37:   */   
/* 38:   */   protected abstract cxl a(Block parambec);
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnc
 * JD-Core Version:    0.7.0.1
 */