package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bni
/*   5:    */   extends bnn
/*   6:    */ {
/*   7:    */   public bni() {}
/*   8:    */   
/*   9:    */   public bni(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  10:    */   {
/*  11:790 */     super(parambnk, paramInt);
/*  12:    */     
/*  13:792 */     this.m = paramej;
/*  14:793 */     this.l = parambjb;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public static bni a(bnk parambnk, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*  18:    */   {
/*  19:797 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 5, 12, 9, paramej);
/*  20:799 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*  21:800 */       return null;
/*  22:    */     }
/*  23:803 */     return new bni(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*  24:    */   }
/*  25:    */   
/*  26:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*  27:    */   {
/*  28:808 */     if (this.h < 0)
/*  29:    */     {
/*  30:809 */       this.h = b(paramaqu, parambjb);
/*  31:810 */       if (this.h < 0) {
/*  32:811 */         return true;
/*  33:    */       }
/*  34:813 */       this.l.a(0, this.h - this.l.e + 12 - 1, 0);
/*  35:    */     }
/*  36:817 */     a(paramaqu, parambjb, 1, 1, 1, 3, 3, 7, BlockList.air.instance(), BlockList.air.instance(), false);
/*  37:818 */     a(paramaqu, parambjb, 1, 5, 1, 3, 9, 3, BlockList.air.instance(), BlockList.air.instance(), false);
/*  38:    */     
/*  39:    */ 
/*  40:821 */     a(paramaqu, parambjb, 1, 0, 0, 3, 0, 8, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  41:    */     
/*  42:    */ 
/*  43:824 */     a(paramaqu, parambjb, 1, 1, 0, 3, 10, 0, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  44:    */     
/*  45:826 */     a(paramaqu, parambjb, 0, 1, 1, 0, 10, 3, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  46:    */     
/*  47:828 */     a(paramaqu, parambjb, 4, 1, 1, 4, 10, 3, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  48:    */     
/*  49:830 */     a(paramaqu, parambjb, 0, 0, 4, 0, 4, 7, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  50:    */     
/*  51:832 */     a(paramaqu, parambjb, 4, 0, 4, 4, 4, 7, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  52:    */     
/*  53:834 */     a(paramaqu, parambjb, 1, 1, 8, 3, 4, 8, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  54:    */     
/*  55:836 */     a(paramaqu, parambjb, 1, 5, 4, 3, 10, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  56:    */     
/*  57:    */ 
/*  58:839 */     a(paramaqu, parambjb, 1, 5, 5, 3, 5, 7, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  59:    */     
/*  60:841 */     a(paramaqu, parambjb, 0, 9, 0, 4, 9, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  61:    */     
/*  62:843 */     a(paramaqu, parambjb, 0, 4, 0, 4, 4, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*  63:844 */     a(paramaqu, BlockList.cobblestone.instance(), 0, 11, 2, parambjb);
/*  64:845 */     a(paramaqu, BlockList.cobblestone.instance(), 4, 11, 2, parambjb);
/*  65:846 */     a(paramaqu, BlockList.cobblestone.instance(), 2, 11, 0, parambjb);
/*  66:847 */     a(paramaqu, BlockList.cobblestone.instance(), 2, 11, 4, parambjb);
/*  67:    */     
/*  68:    */ 
/*  69:850 */     a(paramaqu, BlockList.cobblestone.instance(), 1, 1, 6, parambjb);
/*  70:851 */     a(paramaqu, BlockList.cobblestone.instance(), 1, 1, 7, parambjb);
/*  71:852 */     a(paramaqu, BlockList.cobblestone.instance(), 2, 1, 7, parambjb);
/*  72:853 */     a(paramaqu, BlockList.cobblestone.instance(), 3, 1, 6, parambjb);
/*  73:854 */     a(paramaqu, BlockList.cobblestone.instance(), 3, 1, 7, parambjb);
/*  74:855 */     a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 1, 1, 5, parambjb);
/*  75:856 */     a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 2, 1, 6, parambjb);
/*  76:857 */     a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 3, 1, 5, parambjb);
/*  77:858 */     a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 1)), 1, 2, 7, parambjb);
/*  78:859 */     a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 0)), 3, 2, 7, parambjb);
/*  79:    */     
/*  80:    */ 
/*  81:862 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 2, parambjb);
/*  82:863 */     a(paramaqu, BlockList.bj.instance(), 0, 3, 2, parambjb);
/*  83:864 */     a(paramaqu, BlockList.bj.instance(), 4, 2, 2, parambjb);
/*  84:865 */     a(paramaqu, BlockList.bj.instance(), 4, 3, 2, parambjb);
/*  85:866 */     a(paramaqu, BlockList.bj.instance(), 0, 6, 2, parambjb);
/*  86:867 */     a(paramaqu, BlockList.bj.instance(), 0, 7, 2, parambjb);
/*  87:868 */     a(paramaqu, BlockList.bj.instance(), 4, 6, 2, parambjb);
/*  88:869 */     a(paramaqu, BlockList.bj.instance(), 4, 7, 2, parambjb);
/*  89:870 */     a(paramaqu, BlockList.bj.instance(), 2, 6, 0, parambjb);
/*  90:871 */     a(paramaqu, BlockList.bj.instance(), 2, 7, 0, parambjb);
/*  91:872 */     a(paramaqu, BlockList.bj.instance(), 2, 6, 4, parambjb);
/*  92:873 */     a(paramaqu, BlockList.bj.instance(), 2, 7, 4, parambjb);
/*  93:874 */     a(paramaqu, BlockList.bj.instance(), 0, 3, 6, parambjb);
/*  94:875 */     a(paramaqu, BlockList.bj.instance(), 4, 3, 6, parambjb);
/*  95:876 */     a(paramaqu, BlockList.bj.instance(), 2, 3, 8, parambjb);
/*  96:    */     
/*  97:    */ 
/*  98:879 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.opposite()), 2, 4, 7, parambjb);
/*  99:880 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.yRotate()), 1, 4, 6, parambjb);
/* 100:881 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.ccw()), 3, 4, 6, parambjb);
/* 101:882 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m), 2, 4, 5, parambjb);
/* 102:    */     
/* 103:    */ 
/* 104:885 */     int i = a(BlockList.au, 4);
/* 105:886 */     for (int j = 1; j <= 9; j++) {
/* 106:887 */       a(paramaqu, BlockList.au.instance(i), 3, j, 3, parambjb);
/* 107:    */     }
/* 108:891 */     a(paramaqu, BlockList.air.instance(), 2, 1, 0, parambjb);
/* 109:892 */     a(paramaqu, BlockList.air.instance(), 2, 2, 0, parambjb);
/* 110:893 */     a(paramaqu, parambjb, paramRandom, 2, 1, 0, EnumDirection.b(a(BlockList.woodenDoor, 1)));
/* 111:894 */     if ((a(paramaqu, 2, 0, -1, parambjb).getProto().getMaterial() == Material.air) && (a(paramaqu, 2, -1, -1, parambjb).getProto().getMaterial() != Material.air)) {
/* 112:895 */       a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 2, 0, -1, parambjb);
/* 113:    */     }
/* 114:898 */     for (int j = 0; j < 9; j++) {
/* 115:899 */       for (int k = 0; k < 5; k++)
/* 116:    */       {
/* 117:900 */         b(paramaqu, k, 12, j, parambjb);
/* 118:901 */         b(paramaqu, BlockList.cobblestone.instance(), k, -1, j, parambjb);
/* 119:    */       }
/* 120:    */     }
/* 121:905 */     a(paramaqu, parambjb, 2, 1, 2, 1);
/* 122:    */     
/* 123:907 */     return true;
/* 124:    */   }
/* 125:    */   
/* 126:    */   protected int c(int paramInt1, int paramInt2)
/* 127:    */   {
/* 128:912 */     return 2;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bni
 * JD-Core Version:    0.7.0.1
 */