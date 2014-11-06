package net.minecraft.src;
/*    1:     */ import com.google.common.collect.Lists;
/*    2:     */ import java.util.List;
/*    3:     */ import java.util.Random;
/*    4:     */ 
/*    5:     */ public class bme
/*    6:     */   extends bmk
/*    7:     */ {
/*    8: 919 */   private static final List<vl> b = Lists.newArrayList(new vl[] { new vl(ItemList.j, 0, 1, 5, 10), new vl(ItemList.k, 0, 1, 3, 5), new vl(ItemList.aC, 0, 4, 9, 5), new vl(ItemList.h, 0, 3, 8, 10), new vl(ItemList.P, 0, 1, 3, 15), new vl(ItemList.e, 0, 1, 3, 15), new vl(ItemList.b, 0, 1, 1, 1) });
/*    9:     */   protected int a;
/*   10:     */   
/*   11:     */   public bme() {}
/*   12:     */   
/*   13:     */   public bme(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   14:     */   {
/*   15: 941 */     super(paramInt);
/*   16:     */     
/*   17: 943 */     this.m = paramej;
/*   18: 944 */     this.d = a(paramRandom);
/*   19: 945 */     this.l = parambjb;
/*   20: 946 */     this.a = paramRandom.nextInt(5);
/*   21:     */   }
/*   22:     */   
/*   23:     */   protected void a(NBTTagCompound paramfn)
/*   24:     */   {
/*   25: 951 */     super.a(paramfn);
/*   26: 952 */     paramfn.setInt("Type", this.a);
/*   27:     */   }
/*   28:     */   
/*   29:     */   protected void b(NBTTagCompound paramfn)
/*   30:     */   {
/*   31: 957 */     super.b(paramfn);
/*   32: 958 */     this.a = paramfn.getInteger("Type");
/*   33:     */   }
/*   34:     */   
/*   35:     */   public void a(bms parambms, List<bms> paramList, Random paramRandom)
/*   36:     */   {
/*   37: 963 */     a((bmh)parambms, paramList, paramRandom, 4, 1);
/*   38: 964 */     b((bmh)parambms, paramList, paramRandom, 1, 4);
/*   39: 965 */     c((bmh)parambms, paramList, paramRandom, 1, 4);
/*   40:     */   }
/*   41:     */   
/*   42:     */   public static bme a(List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   43:     */   {
/*   44: 969 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, -4, -1, 0, 11, 7, 11, paramej);
/*   45: 971 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   46: 972 */       return null;
/*   47:     */     }
/*   48: 975 */     return new bme(paramInt4, paramRandom, localbjb, paramej);
/*   49:     */   }
/*   50:     */   
/*   51:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   52:     */   {
/*   53: 980 */     if (a(paramaqu, parambjb)) {
/*   54: 981 */       return false;
/*   55:     */     }
/*   56: 985 */     a(paramaqu, parambjb, 0, 0, 0, 10, 6, 10, true, paramRandom, blr.c());
/*   57:     */     
/*   58: 987 */     a(paramaqu, paramRandom, parambjb, this.d, 4, 1, 0);
/*   59:     */     
/*   60: 989 */     a(paramaqu, parambjb, 4, 1, 10, 6, 3, 10, BlockList.air.instance(), BlockList.air.instance(), false);
/*   61: 990 */     a(paramaqu, parambjb, 0, 1, 4, 0, 3, 6, BlockList.air.instance(), BlockList.air.instance(), false);
/*   62: 991 */     a(paramaqu, parambjb, 10, 1, 4, 10, 3, 6, BlockList.air.instance(), BlockList.air.instance(), false);
/*   63:     */     int i;
/*   64: 993 */     switch (this.a)
/*   65:     */     {
/*   66:     */     default: 
/*   67:     */       break;
/*   68:     */     case 0: 
/*   69: 998 */       a(paramaqu, BlockList.bf.instance(), 5, 1, 5, parambjb);
/*   70: 999 */       a(paramaqu, BlockList.bf.instance(), 5, 2, 5, parambjb);
/*   71:1000 */       a(paramaqu, BlockList.bf.instance(), 5, 3, 5, parambjb);
/*   72:1001 */       a(paramaqu, BlockList.torch.instance(), 4, 3, 5, parambjb);
/*   73:1002 */       a(paramaqu, BlockList.torch.instance(), 6, 3, 5, parambjb);
/*   74:1003 */       a(paramaqu, BlockList.torch.instance(), 5, 3, 4, parambjb);
/*   75:1004 */       a(paramaqu, BlockList.torch.instance(), 5, 3, 6, parambjb);
/*   76:1005 */       a(paramaqu, BlockList.U.instance(), 4, 1, 4, parambjb);
/*   77:1006 */       a(paramaqu, BlockList.U.instance(), 4, 1, 5, parambjb);
/*   78:1007 */       a(paramaqu, BlockList.U.instance(), 4, 1, 6, parambjb);
/*   79:1008 */       a(paramaqu, BlockList.U.instance(), 6, 1, 4, parambjb);
/*   80:1009 */       a(paramaqu, BlockList.U.instance(), 6, 1, 5, parambjb);
/*   81:1010 */       a(paramaqu, BlockList.U.instance(), 6, 1, 6, parambjb);
/*   82:1011 */       a(paramaqu, BlockList.U.instance(), 5, 1, 4, parambjb);
/*   83:1012 */       a(paramaqu, BlockList.U.instance(), 5, 1, 6, parambjb);
/*   84:1013 */       break;
/*   85:     */     case 1: 
/*   86:1015 */       for (i = 0; i < 5; i++)
/*   87:     */       {
/*   88:1016 */         a(paramaqu, BlockList.bf.instance(), 3, 1, 3 + i, parambjb);
/*   89:1017 */         a(paramaqu, BlockList.bf.instance(), 7, 1, 3 + i, parambjb);
/*   90:1018 */         a(paramaqu, BlockList.bf.instance(), 3 + i, 1, 3, parambjb);
/*   91:1019 */         a(paramaqu, BlockList.bf.instance(), 3 + i, 1, 7, parambjb);
/*   92:     */       }
/*   93:1021 */       a(paramaqu, BlockList.bf.instance(), 5, 1, 5, parambjb);
/*   94:1022 */       a(paramaqu, BlockList.bf.instance(), 5, 2, 5, parambjb);
/*   95:1023 */       a(paramaqu, BlockList.bf.instance(), 5, 3, 5, parambjb);
/*   96:1024 */       a(paramaqu, BlockList.i.instance(), 5, 4, 5, parambjb);
/*   97:1025 */       break;
/*   98:     */     case 2: 
/*   99:1027 */       for (i = 1; i <= 9; i++)
/*  100:     */       {
/*  101:1028 */         a(paramaqu, BlockList.cobblestone.instance(), 1, 3, i, parambjb);
/*  102:1029 */         a(paramaqu, BlockList.cobblestone.instance(), 9, 3, i, parambjb);
/*  103:     */       }
/*  104:1031 */       for (i = 1; i <= 9; i++)
/*  105:     */       {
/*  106:1032 */         a(paramaqu, BlockList.cobblestone.instance(), i, 3, 1, parambjb);
/*  107:1033 */         a(paramaqu, BlockList.cobblestone.instance(), i, 3, 9, parambjb);
/*  108:     */       }
/*  109:1035 */       a(paramaqu, BlockList.cobblestone.instance(), 5, 1, 4, parambjb);
/*  110:1036 */       a(paramaqu, BlockList.cobblestone.instance(), 5, 1, 6, parambjb);
/*  111:1037 */       a(paramaqu, BlockList.cobblestone.instance(), 5, 3, 4, parambjb);
/*  112:1038 */       a(paramaqu, BlockList.cobblestone.instance(), 5, 3, 6, parambjb);
/*  113:1039 */       a(paramaqu, BlockList.cobblestone.instance(), 4, 1, 5, parambjb);
/*  114:1040 */       a(paramaqu, BlockList.cobblestone.instance(), 6, 1, 5, parambjb);
/*  115:1041 */       a(paramaqu, BlockList.cobblestone.instance(), 4, 3, 5, parambjb);
/*  116:1042 */       a(paramaqu, BlockList.cobblestone.instance(), 6, 3, 5, parambjb);
/*  117:1043 */       for (i = 1; i <= 3; i++)
/*  118:     */       {
/*  119:1044 */         a(paramaqu, BlockList.cobblestone.instance(), 4, i, 4, parambjb);
/*  120:1045 */         a(paramaqu, BlockList.cobblestone.instance(), 6, i, 4, parambjb);
/*  121:1046 */         a(paramaqu, BlockList.cobblestone.instance(), 4, i, 6, parambjb);
/*  122:1047 */         a(paramaqu, BlockList.cobblestone.instance(), 6, i, 6, parambjb);
/*  123:     */       }
/*  124:1049 */       a(paramaqu, BlockList.torch.instance(), 5, 3, 5, parambjb);
/*  125:1050 */       for (i = 2; i <= 8; i++)
/*  126:     */       {
/*  127:1051 */         a(paramaqu, BlockList.planks.instance(), 2, 3, i, parambjb);
/*  128:1052 */         a(paramaqu, BlockList.planks.instance(), 3, 3, i, parambjb);
/*  129:1053 */         if ((i <= 3) || (i >= 7))
/*  130:     */         {
/*  131:1054 */           a(paramaqu, BlockList.planks.instance(), 4, 3, i, parambjb);
/*  132:1055 */           a(paramaqu, BlockList.planks.instance(), 5, 3, i, parambjb);
/*  133:1056 */           a(paramaqu, BlockList.planks.instance(), 6, 3, i, parambjb);
/*  134:     */         }
/*  135:1058 */         a(paramaqu, BlockList.planks.instance(), 7, 3, i, parambjb);
/*  136:1059 */         a(paramaqu, BlockList.planks.instance(), 8, 3, i, parambjb);
/*  137:     */       }
/*  138:1061 */       a(paramaqu, BlockList.au.a(a(BlockList.au, EnumDirection.WEST.a())), 9, 1, 3, parambjb);
/*  139:1062 */       a(paramaqu, BlockList.au.a(a(BlockList.au, EnumDirection.WEST.a())), 9, 2, 3, parambjb);
/*  140:1063 */       a(paramaqu, BlockList.au.a(a(BlockList.au, EnumDirection.WEST.a())), 9, 3, 3, parambjb);
/*  141:     */       
/*  142:1065 */       a(paramaqu, parambjb, paramRandom, 3, 4, 8, vl.a(b, new vl[] { ItemList.cd.b(paramRandom) }), 1 + paramRandom.nextInt(4));
/*  143:     */     }
/*  144:1069 */     return true;
/*  145:     */   }
/*  146:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bme
 * JD-Core Version:    0.7.0.1
 */