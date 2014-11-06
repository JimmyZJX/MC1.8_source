package net.minecraft.src;
/*  1:   */ public class csm
/*  2:   */   extends csb<ccl>
/*  3:   */ {
/*  4:   */   public csm(cqv paramcqv)
/*  5:   */   {
/*  6: 9 */     super(paramcqv);
/*  7:   */   }
/*  8:   */   
/*  9:   */   protected void a()
/* 10:   */   {
/* 11:14 */     this.c = new ccl(0.5F);
/* 12:15 */     this.d = new ccl(1.0F);
/* 13:   */   }
/* 14:   */   
/* 15:   */   protected void a(ccl paramccl, int paramInt)
/* 16:   */   {
/* 17:20 */     a(paramccl);
/* 18:22 */     switch (paramInt)
/* 19:   */     {
/* 20:   */     case 4: 
/* 21:24 */       paramccl.e.j = true;
/* 22:25 */       paramccl.f.j = true;
/* 23:   */       
/* 24:27 */       break;
/* 25:   */     case 3: 
/* 26:29 */       paramccl.g.j = true;
/* 27:30 */       paramccl.h.j = true;
/* 28:31 */       paramccl.i.j = true;
/* 29:   */       
/* 30:33 */       break;
/* 31:   */     case 2: 
/* 32:35 */       paramccl.g.j = true;
/* 33:36 */       paramccl.j.j = true;
/* 34:37 */       paramccl.k.j = true;
/* 35:   */       
/* 36:39 */       break;
/* 37:   */     case 1: 
/* 38:41 */       paramccl.j.j = true;
/* 39:42 */       paramccl.k.j = true;
/* 40:   */     }
/* 41:   */   }
/* 42:   */   
/* 43:   */   protected void a(ccl paramccl)
/* 44:   */   {
/* 45:50 */     paramccl.a(false);
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csm
 * JD-Core Version:    0.7.0.1
 */