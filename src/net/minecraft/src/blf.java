package net.minecraft.src;
/*    1:     */ class blf
/*    2:     */ {
/*    3:     */   int a;
/*    4:1839 */   blf[] b = new blf[6];
/*    5:1840 */   boolean[] c = new boolean[6];
/*    6:     */   boolean d;
/*    7:     */   boolean e;
/*    8:     */   int f;
/*    9:     */   
/*   10:     */   public blf(int paramInt)
/*   11:     */   {
/*   12:1846 */     this.a = paramInt;
/*   13:     */   }
/*   14:     */   
/*   15:     */   public void a(EnumDirection paramej, blf paramblf)
/*   16:     */   {
/*   17:1850 */     this.b[paramej.a()] = paramblf;
/*   18:1851 */     paramblf.b[paramej.opposite().a()] = this;
/*   19:     */   }
/*   20:     */   
/*   21:     */   public void a()
/*   22:     */   {
/*   23:1855 */     for (int i = 0; i < 6; i++) {
/*   24:1856 */       this.c[i] = (this.b[i] != null ? true : false);
/*   25:     */     }
/*   26:     */   }
/*   27:     */   
/*   28:     */   public boolean a(int paramInt)
/*   29:     */   {
/*   30:1861 */     if (this.e) {
/*   31:1862 */       return true;
/*   32:     */     }
/*   33:1864 */     this.f = paramInt;
/*   34:1865 */     for (int i = 0; i < 6; i++) {
/*   35:1866 */       if ((this.b[i] != null) && (this.c[i]) && 
/*   36:1867 */         (this.b[i].f != paramInt) && (this.b[i].a(paramInt))) {
/*   37:1868 */         return true;
/*   38:     */       }
/*   39:     */     }
/*   40:1872 */     return false;
/*   41:     */   }
/*   42:     */   
/*   43:     */   public boolean b()
/*   44:     */   {
/*   45:1876 */     return this.a >= 75;
/*   46:     */   }
/*   47:     */   
/*   48:     */   public int c()
/*   49:     */   {
/*   50:1880 */     int i = 0;
/*   51:1881 */     for (int j = 0; j < 6; j++) {
/*   52:1882 */       if (this.c[j]) {
/*   53:1883 */         i++;
/*   54:     */       }
/*   55:     */     }
/*   56:1886 */     return i;
/*   57:     */   }
/*   58:     */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     blf
 * JD-Core Version:    0.7.0.1
 */