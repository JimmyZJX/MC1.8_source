package net.minecraft.src;
/*    1:     */ import java.util.List;
/*    2:     */ import java.util.Random;
/*    3:     */ 
/*    4:     */ public class bnd
/*    5:     */   extends bnn
/*    6:     */ {
/*    7:     */   public bnd() {}
/*    8:     */   
/*    9:     */   public bnd(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*   10:     */   {
/*   11:1845 */     super(parambnk, paramInt);
/*   12:     */     
/*   13:1847 */     this.m = paramej;
/*   14:1848 */     this.l = parambjb;
/*   15:     */   }
/*   16:     */   
/*   17:     */   public static bjb a(bnk parambnk, List<bms> paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej)
/*   18:     */   {
/*   19:1852 */     bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 3, 4, 2, paramej);
/*   20:1854 */     if (bms.a(paramList, localbjb) != null) {
/*   21:1855 */       return null;
/*   22:     */     }
/*   23:1858 */     return localbjb;
/*   24:     */   }
/*   25:     */   
/*   26:     */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/*   27:     */   {
/*   28:1863 */     if (this.h < 0)
/*   29:     */     {
/*   30:1864 */       this.h = b(paramaqu, parambjb);
/*   31:1865 */       if (this.h < 0) {
/*   32:1866 */         return true;
/*   33:     */       }
/*   34:1868 */       this.l.a(0, this.h - this.l.e + 4 - 1, 0);
/*   35:     */     }
/*   36:1872 */     a(paramaqu, parambjb, 0, 0, 0, 2, 3, 1, BlockList.air.instance(), BlockList.air.instance(), false);
/*   37:     */     
/*   38:     */ 
/*   39:1875 */     a(paramaqu, BlockList.fence.instance(), 1, 0, 0, parambjb);
/*   40:1876 */     a(paramaqu, BlockList.fence.instance(), 1, 1, 0, parambjb);
/*   41:1877 */     a(paramaqu, BlockList.fence.instance(), 1, 2, 0, parambjb);
/*   42:     */     
/*   43:     */ 
/*   44:1880 */     a(paramaqu, BlockList.wool.instance(EnumDyeColor.WHITE.b()), 1, 3, 0, parambjb);
/*   45:     */     
/*   46:     */ 
/*   47:1883 */     int i = (this.m == EnumDirection.EAST) || (this.m == EnumDirection.NORTH) ? 1 : 0;
/*   48:1884 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.e()), i != 0 ? 2 : 0, 3, 0, parambjb);
/*   49:1885 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m), 1, 3, 1, parambjb);
/*   50:1886 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.f()), i != 0 ? 0 : 2, 3, 0, parambjb);
/*   51:1887 */     a(paramaqu, BlockList.torch.instance().setData(bbl.a, this.m.d()), 1, 3, -1, parambjb);
/*   52:     */     
/*   53:1889 */     return true;
/*   54:     */   }
/*   55:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnd
 * JD-Core Version:    0.7.0.1
 */