package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnh
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   private boolean a;
/*    8:     */   private int b;
/*    9:     */   
/*   10:     */   public bnh() {}
/*   11:     */   
/*   12:     */   public bnh(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   13:     */   {
/*   14:1066 */     super(parambnk, paramInt);
/*   15:     */     
/*   16:1068 */     this.m = paramej;
/*   17:1069 */     this.l = parambjb;
/*   18:1070 */     this.a = paramRandom.nextBoolean();
/*   19:1071 */     this.b = paramRandom.nextInt(3);
/*   20:     */   }
/*   21:     */   
/*   22:     */   protected void a(NBTTagCompound paramfn)
/*   23:     */   {
/*   24:1076 */     super.a(paramfn);
/*   25:1077 */     paramfn.setInt("T", this.b);
/*   26:1078 */     paramfn.setBoolean("C", this.a);
/*   27:     */   }
/*   28:     */   
/*   29:     */   protected void b(NBTTagCompound paramfn)
/*   30:     */   {
/*   31:1083 */     super.b(paramfn);
/*   32:1084 */     this.b = paramfn.getInteger("T");
/*   33:1085 */     this.a = paramfn.getBoolean("C");
/*   34:     */   }
/*   35:     */   
/*   36:     */   public static bnh a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej, int paramInt4)
/*   37:     */   {
/*   38:1089 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 4, 6, 5, paramej);
/*   39:1091 */     if ((!a(localbjb)) || (bms.a(paramList, localbjb) != null)) {
/*   40:1092 */       return null;
/*   41:     */     }
/*   42:1095 */     return new bnh(parambnk, paramInt4, paramRandom, localbjb, paramej);
/*   43:     */   }
/*   44:     */   
/*   45:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   46:     */   {
/*   47:1100 */     if (this.h < 0)
/*   48:     */     {
/*   49:1101 */       this.h = b(paramaqu, parambjb);
/*   50:1102 */       if (this.h < 0) {
/*   51:1103 */         return true;
/*   52:     */       }
/*   53:1105 */       this.l.a(0, this.h - this.l.e + 6 - 1, 0);
/*   54:     */     }
/*   55:1109 */     a(paramaqu, parambjb, 1, 1, 1, 3, 5, 4, BlockList.air.instance(), BlockList.air.instance(), false);
/*   56:     */     
/*   57:     */ 
/*   58:1112 */     a(paramaqu, parambjb, 0, 0, 0, 3, 0, 4, BlockList.cobblestone.instance(), BlockList.cobblestone.instance(), false);
/*   59:1113 */     a(paramaqu, parambjb, 1, 0, 1, 2, 0, 3, BlockList.dirt.instance(), BlockList.dirt.instance(), false);
/*   60:1115 */     if (this.a) {
/*   61:1116 */       a(paramaqu, parambjb, 1, 4, 1, 2, 4, 3, BlockList.log.instance(), BlockList.log.instance(), false);
/*   62:     */     } else {
/*   63:1118 */       a(paramaqu, parambjb, 1, 5, 1, 2, 5, 3, BlockList.log.instance(), BlockList.log.instance(), false);
/*   64:     */     }
/*   65:1120 */     a(paramaqu, BlockList.log.instance(), 1, 4, 0, parambjb);
/*   66:1121 */     a(paramaqu, BlockList.log.instance(), 2, 4, 0, parambjb);
/*   67:1122 */     a(paramaqu, BlockList.log.instance(), 1, 4, 4, parambjb);
/*   68:1123 */     a(paramaqu, BlockList.log.instance(), 2, 4, 4, parambjb);
/*   69:1124 */     a(paramaqu, BlockList.log.instance(), 0, 4, 1, parambjb);
/*   70:1125 */     a(paramaqu, BlockList.log.instance(), 0, 4, 2, parambjb);
/*   71:1126 */     a(paramaqu, BlockList.log.instance(), 0, 4, 3, parambjb);
/*   72:1127 */     a(paramaqu, BlockList.log.instance(), 3, 4, 1, parambjb);
/*   73:1128 */     a(paramaqu, BlockList.log.instance(), 3, 4, 2, parambjb);
/*   74:1129 */     a(paramaqu, BlockList.log.instance(), 3, 4, 3, parambjb);
/*   75:     */     
/*   76:     */ 
/*   77:1132 */     a(paramaqu, parambjb, 0, 1, 0, 0, 3, 0, BlockList.log.instance(), BlockList.log.instance(), false);
/*   78:1133 */     a(paramaqu, parambjb, 3, 1, 0, 3, 3, 0, BlockList.log.instance(), BlockList.log.instance(), false);
/*   79:1134 */     a(paramaqu, parambjb, 0, 1, 4, 0, 3, 4, BlockList.log.instance(), BlockList.log.instance(), false);
/*   80:1135 */     a(paramaqu, parambjb, 3, 1, 4, 3, 3, 4, BlockList.log.instance(), BlockList.log.instance(), false);
/*   81:     */     
/*   82:     */ 
/*   83:1138 */     a(paramaqu, parambjb, 0, 1, 1, 0, 3, 3, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   84:1139 */     a(paramaqu, parambjb, 3, 1, 1, 3, 3, 3, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   85:1140 */     a(paramaqu, parambjb, 1, 1, 0, 2, 3, 0, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   86:1141 */     a(paramaqu, parambjb, 1, 1, 4, 2, 3, 4, BlockList.planks.instance(), BlockList.planks.instance(), false);
/*   87:     */     
/*   88:     */ 
/*   89:1144 */     a(paramaqu, BlockList.bj.instance(), 0, 2, 2, parambjb);
/*   90:1145 */     a(paramaqu, BlockList.bj.instance(), 3, 2, 2, parambjb);
/*   91:1148 */     if (this.b > 0)
/*   92:     */     {
/*   93:1149 */       a(paramaqu, BlockList.fence.instance(), this.b, 1, 3, parambjb);
/*   94:1150 */       a(paramaqu, BlockList.aB.instance(), this.b, 2, 3, parambjb);
/*   95:     */     }
/*   96:1154 */     a(paramaqu, BlockList.air.instance(), 1, 1, 0, parambjb);
/*   97:1155 */     a(paramaqu, BlockList.air.instance(), 1, 2, 0, parambjb);
/*   98:1156 */     a(paramaqu, parambjb, paramRandom, 1, 1, 0, EnumDirection.b(a(BlockList.woodenDoor, 1)));
/*   99:1157 */     if ((a(paramaqu, 1, 0, -1, parambjb).getProto().getMaterial() == Material.air) && (a(paramaqu, 1, -1, -1, parambjb).getProto().getMaterial() != Material.air)) {
/*  100:1158 */       a(paramaqu, BlockList.aw.instance(a(BlockList.aw, 3)), 1, 0, -1, parambjb);
/*  101:     */     }
/*  102:1161 */     for (int i = 0; i < 5; i++) {
/*  103:1162 */       for (int j = 0; j < 4; j++)
/*  104:     */       {
/*  105:1163 */         b(paramaqu, j, 6, i, parambjb);
/*  106:1164 */         b(paramaqu, BlockList.cobblestone.instance(), j, -1, i, parambjb);
/*  107:     */       }
/*  108:     */     }
/*  109:1168 */     a(paramaqu, parambjb, 1, 1, 2, 1);
/*  110:     */     
/*  111:1170 */     return true;
/*  112:     */   }
/*  113:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnh
 * JD-Core Version:    0.7.0.1
 */