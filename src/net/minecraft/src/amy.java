package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Maps;
/*  2:   */ import java.util.List;
/*  3:   */ import java.util.Map;
/*  4:   */ 
/*  5:   */ public class amy
/*  6:   */   extends Item
/*  7:   */ {
/*  8:18 */   private static final Map b = null; //BROKEN
/*  9:   */   public final String a;
/* 10:   */   
/* 11:   */   protected amy(String paramString)
/* 12:   */   {
/* 13:23 */     this.a = paramString;
/* 14:24 */     this.maxStackSize = 1;
/* 15:25 */     setTabToDisplayOn(CreativeTabs.tabMisc);
/* 16:   */     
/* 17:27 */     b.put("records." + paramString, this);
/* 18:   */   }
/* 19:   */   
/* 20:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 21:   */   {
/* 22:32 */     Block localbec = paramaqu.getBlock(paramdt);
/* 23:33 */     if ((localbec.getProto() == BlockList.aN) && (!((Boolean)localbec.getProperty(axc.a)).booleanValue()))
/* 24:   */     {
/* 25:34 */       if (paramaqu.isClient) {
/* 26:35 */         return true;
/* 27:   */       }
/* 28:38 */       ((axc)BlockList.aN).a(paramaqu, paramdt, localbec, paramamj);
/* 29:39 */       paramaqu.playLevelEvent(null, 1005, paramdt, Item.b(this));
/* 30:40 */       paramamj.stackSize -= 1;
/* 31:41 */       return true;
/* 32:   */     }
/* 33:43 */     return false;
/* 34:   */   }
/* 35:   */   
/* 36:   */   public void a(ItemStack paramamj, EntityPlayer paramahd, List paramList, boolean paramBoolean)
/* 37:   */   {
/* 38:48 */     paramList.add(g());
/* 39:   */   }
/* 40:   */   
/* 41:   */   public String g()
/* 42:   */   {
/* 43:52 */     return fi.a("item.record." + this.a + ".desc");
/* 44:   */   }
/* 45:   */   
/* 46:   */   public amx g(ItemStack paramamj)
/* 47:   */   {
/* 48:57 */     return amx.c;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public static amy b(String paramString)
/* 52:   */   {
/* 53:61 */     return (amy)b.get(paramString);
/* 54:   */   }
/* 55:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     amy
 * JD-Core Version:    0.7.0.1
 */