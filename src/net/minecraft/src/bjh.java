package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bjh
/*   5:    */   extends bms
/*   6:    */ {
/*   7:    */   private EnumDirection a;
/*   8:    */   private boolean b;
/*   9:    */   
/*  10:    */   public bjh() {}
/*  11:    */   
/*  12:    */   protected void a(NBTTagCompound paramfn)
/*  13:    */   {
/*  14:468 */     paramfn.setBoolean("tf", this.b);
/*  15:469 */     paramfn.setInt("D", this.a.b());
/*  16:    */   }
/*  17:    */   
/*  18:    */   protected void b(NBTTagCompound paramfn)
/*  19:    */   {
/*  20:474 */     this.b = paramfn.getBoolean("tf");
/*  21:475 */     this.a = EnumDirection.b(paramfn.getInteger("D"));
/*  22:    */   }
/*  23:    */   
/*  24:    */   public bjh(int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  25:    */   {
/*  26:479 */     super(paramInt);
/*  27:    */     
/*  28:481 */     this.a = paramej;
/*  29:482 */     this.l = parambjb;
/*  30:483 */     this.b = (parambjb.d() > 3);
/*  31:    */   }
/*  32:    */   
/*  33:    */   public static bjb a(List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej)
/*  34:    */   {
/*  35:487 */     bjb localbjb = new bjb(paramInt1, paramInt2, paramInt3, paramInt1, paramInt2 + 2, paramInt3);
/*  36:489 */     if (paramRandom.nextInt(4) == 0) {
/*  37:490 */       localbjb.e += 4;
/*  38:    */     }
/*  39:493 */     switch (bjf.a[paramej.ordinal()])
/*  40:    */     {
/*  41:    */     case 1: 
/*  42:495 */       localbjb.a = (paramInt1 - 1);
/*  43:496 */       localbjb.d = (paramInt1 + 3);
/*  44:497 */       localbjb.c = (paramInt3 - 4);
/*  45:498 */       break;
/*  46:    */     case 2: 
/*  47:500 */       localbjb.a = (paramInt1 - 1);
/*  48:501 */       localbjb.d = (paramInt1 + 3);
/*  49:502 */       localbjb.f = (paramInt3 + 4);
/*  50:503 */       break;
/*  51:    */     case 3: 
/*  52:505 */       localbjb.a = (paramInt1 - 4);
/*  53:506 */       localbjb.c = (paramInt3 - 1);
/*  54:507 */       localbjb.f = (paramInt3 + 3);
/*  55:508 */       break;
/*  56:    */     case 4: 
/*  57:510 */       localbjb.d = (paramInt1 + 4);
/*  58:511 */       localbjb.c = (paramInt3 - 1);
/*  59:512 */       localbjb.f = (paramInt3 + 3);
/*  60:    */     }
/*  61:516 */     if (bms.a(paramList, localbjb) != null) {
/*  62:517 */       return null;
/*  63:    */     }
/*  64:520 */     return localbjb;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  68:    */   {
/*  69:525 */     int i = d();
/*  70:528 */     switch (bjf.a[this.a.ordinal()])
/*  71:    */     {
/*  72:    */     case 1: 
/*  73:530 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.c - 1, EnumDirection.NORTH, i);
/*  74:531 */       bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.c + 1, EnumDirection.WEST, i);
/*  75:532 */       bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.c + 1, EnumDirection.EAST, i);
/*  76:533 */       break;
/*  77:    */     case 2: 
/*  78:535 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.f + 1, EnumDirection.SOUTH, i);
/*  79:536 */       bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.c + 1, EnumDirection.WEST, i);
/*  80:537 */       bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.c + 1, EnumDirection.EAST, i);
/*  81:538 */       break;
/*  82:    */     case 3: 
/*  83:540 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.c - 1, EnumDirection.NORTH, i);
/*  84:541 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.f + 1, EnumDirection.SOUTH, i);
/*  85:542 */       bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.c + 1, EnumDirection.WEST, i);
/*  86:543 */       break;
/*  87:    */     case 4: 
/*  88:545 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.c - 1, EnumDirection.NORTH, i);
/*  89:546 */       bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b, this.l.f + 1, EnumDirection.SOUTH, i);
/*  90:547 */       bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.c + 1, EnumDirection.EAST, i);
/*  91:    */     }
/*  92:551 */     if (this.b)
/*  93:    */     {
/*  94:552 */       if (paramRandom.nextBoolean()) {
/*  95:553 */         bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, EnumDirection.NORTH, i);
/*  96:    */       }
/*  97:555 */       if (paramRandom.nextBoolean()) {
/*  98:556 */         bje.a(parambms, paramList, paramRandom, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, EnumDirection.WEST, i);
/*  99:    */       }
/* 100:558 */       if (paramRandom.nextBoolean()) {
/* 101:559 */         bje.a(parambms, paramList, paramRandom, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, EnumDirection.EAST, i);
/* 102:    */       }
/* 103:561 */       if (paramRandom.nextBoolean()) {
/* 104:562 */         bje.a(parambms, paramList, paramRandom, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, EnumDirection.SOUTH, i);
/* 105:    */       }
/* 106:    */     }
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/* 110:    */   {
/* 111:569 */     if (a(paramaqu, parambjb)) {
/* 112:570 */       return false;
/* 113:    */     }
/* 114:574 */     if (this.b)
/* 115:    */     {
/* 116:575 */       a(paramaqu, parambjb, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, BlockList.air.instance(), BlockList.air.instance(), false);
/* 117:576 */       a(paramaqu, parambjb, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, BlockList.air.instance(), BlockList.air.instance(), false);
/* 118:577 */       a(paramaqu, parambjb, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, BlockList.air.instance(), BlockList.air.instance(), false);
/* 119:578 */       a(paramaqu, parambjb, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, BlockList.air.instance(), BlockList.air.instance(), false);
/* 120:579 */       a(paramaqu, parambjb, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, BlockList.air.instance(), BlockList.air.instance(), false);
/* 121:    */     }
/* 122:    */     else
/* 123:    */     {
/* 124:581 */       a(paramaqu, parambjb, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, BlockList.air.instance(), BlockList.air.instance(), false);
/* 125:582 */       a(paramaqu, parambjb, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, BlockList.air.instance(), BlockList.air.instance(), false);
/* 126:    */     }
/* 127:586 */     a(paramaqu, parambjb, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 128:587 */     a(paramaqu, parambjb, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 129:588 */     a(paramaqu, parambjb, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 130:589 */     a(paramaqu, parambjb, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, BlockList.planks.instance(), BlockList.air.instance(), false);
/* 131:593 */     for (int i = this.l.a; i <= this.l.d; i++) {
/* 132:594 */       for (int j = this.l.c; j <= this.l.f; j++) {
/* 133:595 */         if (a(paramaqu, i, this.l.b - 1, j, parambjb).getProto().getMaterial() == Material.air) {
/* 134:596 */           a(paramaqu, BlockList.planks.instance(), i, this.l.b - 1, j, parambjb);
/* 135:    */         }
/* 136:    */       }
/* 137:    */     }
/* 138:601 */     return true;
/* 139:    */   }
/* 140:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjh
 * JD-Core Version:    0.7.0.1
 */