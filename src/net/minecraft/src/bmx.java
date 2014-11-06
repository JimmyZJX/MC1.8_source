package net.minecraft.src;
/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.LinkedList;
/*   3:    */ import java.util.List;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public class bmx
/*   7:    */   extends bmv
/*   8:    */ {
/*   9:    */   private boolean c;
/*  10:    */   
/*  11:    */   public bmx() {}
/*  12:    */   
/*  13:    */   public bmx(World paramaqu, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*  14:    */   {
/*  15: 89 */     super(paramInt1, paramInt2);
/*  16:    */     
/*  17: 91 */     List localList1 = bmy.a(paramRandom, paramInt3);
/*  18:    */     
/*  19: 93 */     bnk localbnk = new bnk(paramaqu.v(), 0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2, localList1, paramInt3);
/*  20: 94 */     this.a.add(localbnk);
/*  21: 95 */     localbnk.a(localbnk, this.a, paramRandom);
/*  22:    */     
/*  23: 97 */     List localList2 = localbnk.g;
/*  24: 98 */     List localList3 = localbnk.f;
/*  25: 99 */     while ((!localList2.isEmpty()) || (!localList3.isEmpty())) {
/*  26:101 */       if (localList2.isEmpty())
/*  27:    */       {
/*  28:102 */         int i = paramRandom.nextInt(localList3.size());
/*  29:103 */         bms localObject = (bms)localList3.remove(i);
/*  30:104 */         ((bms)localObject).a(localbnk, this.a, paramRandom);
/*  31:    */       }
/*  32:    */       else
/*  33:    */       {
/*  34:106 */         int i = paramRandom.nextInt(localList2.size());
/*  35:107 */         bms localObject = (bms)localList2.remove(i);
/*  36:108 */         ((bms)localObject).a(localbnk, this.a, paramRandom);
/*  37:    */       }
/*  38:    */     }
/*  39:112 */     c();
/*  40:    */     
/*  41:114 */     int i = 0;
/*  42:115 */     for (Object localObject = this.a.iterator(); ((Iterator)localObject).hasNext();)
/*  43:    */     {
/*  44:115 */       bms localbms = (bms)((Iterator)localObject).next();
/*  45:116 */       if (!(localbms instanceof bno)) {
/*  46:117 */         i++;
/*  47:    */       }
/*  48:    */     }
/*  49:120 */     this.c = (i > 2);
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean d()
/*  53:    */   {
/*  54:125 */     return this.c;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public void a(NBTTagCompound paramfn)
/*  58:    */   {
/*  59:130 */     super.a(paramfn);
/*  60:    */     
/*  61:132 */     paramfn.setBoolean("Valid", this.c);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void b(NBTTagCompound paramfn)
/*  65:    */   {
/*  66:137 */     super.b(paramfn);
/*  67:138 */     this.c = paramfn.getBoolean("Valid");
/*  68:    */   }
/*  69:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bmx
 * JD-Core Version:    0.7.0.1
 */