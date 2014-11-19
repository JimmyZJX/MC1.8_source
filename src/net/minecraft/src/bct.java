package net.minecraft.src;
/*  1:   */ public class bct
/*  2:   */   extends bcm
/*  3:   */ {
/*  4:15 */   private final aqf a = new bcu(this);
/*  5:   */   
/*  6:   */   public void writeToNBT(NBTTagCompound paramfn)
/*  7:   */   {
/*  8:65 */     super.writeToNBT(paramfn);
/*  9:66 */     this.a.a(paramfn);
/* 10:   */   }
/* 11:   */   
/* 12:   */   public void readFromNBT(NBTTagCompound paramfn)
/* 13:   */   {
/* 14:71 */     super.readFromNBT(paramfn);
/* 15:72 */     this.a.b(paramfn);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public id x_()
/* 19:   */   {
/* 20:77 */     NBTTagCompound localfn = new NBTTagCompound();
/* 21:78 */     writeToNBT(localfn);
/* 22:79 */     return new iu(this.pos, 2, localfn);
/* 23:   */   }
/* 24:   */   
/* 25:   */   public aqf b()
/* 26:   */   {
/* 27:83 */     return this.a;
/* 28:   */   }
/* 29:   */   
/* 30:   */   public af c()
/* 31:   */   {
/* 32:87 */     return this.a.n();
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bct
 * JD-Core Version:    0.7.0.1
 */