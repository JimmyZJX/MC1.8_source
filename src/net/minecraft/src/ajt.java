package net.minecraft.src;
/*  1:   */ public class ajt
/*  2:   */   extends Item
/*  3:   */ {
/*  4:   */   public ajt()
/*  5:   */   {
/*  6:15 */     setTabToDisplayOn(CreativeTabs.tabDeco);
/*  7:   */   }
/*  8:   */   
/*  9:   */   public boolean a(ItemStack paramamj, EntityPlayer paramahd, World paramaqu, BlockPosition paramdt, EnumDirection paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/* 10:   */   {
/* 11:20 */     if (paramaqu.isClient) {
/* 12:21 */       return true;
/* 13:   */     }
/* 14:24 */     if (paramej != EnumDirection.UP) {
/* 15:25 */       return false;
/* 16:   */     }
/* 17:28 */     Block localbec1 = paramaqu.getBlock(paramdt);
/* 18:29 */     ProtoBlock localatr = localbec1.getProto();
/* 19:30 */     boolean bool1 = localatr.f(paramaqu, paramdt);
/* 20:33 */     if (!bool1) {
/* 21:34 */       paramdt = paramdt.up();
/* 22:   */     }
/* 23:37 */     int i = MathUtils.floor(paramahd.yaw * 4.0F / 360.0F + 0.5D) & 0x3;
/* 24:38 */     EnumDirection localej = EnumDirection.b(i);
/* 25:39 */     BlockPosition localdt = paramdt.a(localej);
/* 26:40 */     boolean bool2 = localatr.f(paramaqu, localdt);
/* 27:   */     
/* 28:42 */     int j = (paramaqu.d(paramdt)) || (bool1) ? 1 : 0;
/* 29:43 */     int k = (paramaqu.d(localdt)) || (bool2) ? 1 : 0;
/* 30:45 */     if ((!paramahd.a(paramdt, paramej, paramamj)) || (!paramahd.a(localdt, paramej, paramamj))) {
/* 31:46 */       return false;
/* 32:   */     }
/* 33:49 */     if ((j != 0) && (k != 0) && (World.isFlatSurface(paramaqu, paramdt.down())) && (World.isFlatSurface(paramaqu, localdt.down())))
/* 34:   */     {
/* 35:50 */       int m = localej.b();
/* 36:   */       
/* 37:   */ 
/* 38:53 */       Block localbec2 = BlockList.C.instance().a(atp.b, Boolean.valueOf(false)).a(atp.N, localej).a(atp.a, atq.b);
/* 39:54 */       if (paramaqu.setBlock(paramdt, localbec2, 3))
/* 40:   */       {
/* 41:55 */         Block localbec3 = localbec2.a(atp.a, atq.a);
/* 42:56 */         paramaqu.setBlock(localdt, localbec3, 3);
/* 43:   */       }
/* 44:59 */       paramamj.stackSize -= 1;
/* 45:60 */       return true;
/* 46:   */     }
/* 47:63 */     return false;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ajt
 * JD-Core Version:    0.7.0.1
 */