package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class anr
/*   4:    */   extends Item
/*   5:    */ {
/*   6:    */   public anr()
/*   7:    */   {
/*   8: 36 */     setStackLimit(1);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public static boolean b(NBTTagCompound paramfn)
/*  12:    */   {
/*  13: 40 */     if (!anq.b(paramfn)) {
/*  14: 41 */       return false;
/*  15:    */     }
/*  16: 44 */     if (!paramfn.hasKey("title", 8)) {
/*  17: 45 */       return false;
/*  18:    */     }
/*  19: 47 */     String str = paramfn.getString("title");
/*  20: 48 */     if ((str == null) || (str.length() > 32)) {
/*  21: 49 */       return false;
/*  22:    */     }
/*  23: 52 */     if (!paramfn.hasKey("author", 8)) {
/*  24: 53 */       return false;
/*  25:    */     }
/*  26: 56 */     return true;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public static int h(ItemStack paramamj)
/*  30:    */   {
/*  31: 60 */     return paramamj.getTagCompound().getInteger("generation");
/*  32:    */   }
/*  33:    */   
/*  34:    */   public String a(ItemStack paramamj)
/*  35:    */   {
/*  36: 65 */     if (paramamj.hasTagCompound())
/*  37:    */     {
/*  38: 66 */       NBTTagCompound localfn = paramamj.getTagCompound();
/*  39:    */       
/*  40: 68 */       String str = localfn.getString("title");
/*  41: 69 */       if (!vb.b(str)) {
/*  42: 70 */         return str;
/*  43:    */       }
/*  44:    */     }
/*  45: 73 */     return super.a(paramamj);
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(ItemStack paramamj, EntityPlayer paramahd, List paramList, boolean paramBoolean)
/*  49:    */   {
/*  50: 78 */     if (paramamj.hasTagCompound())
/*  51:    */     {
/*  52: 79 */       NBTTagCompound localfn = paramamj.getTagCompound();
/*  53:    */       
/*  54: 81 */       String str = localfn.getString("author");
/*  55: 82 */       if (!vb.b(str)) {
/*  56: 83 */         paramList.add(a.h + fi.a("book.byAuthor", new Object[] { str }));
/*  57:    */       }
/*  58: 86 */       paramList.add(a.h + fi.a(new StringBuilder().append("book.generation.").append(localfn.getInteger("generation")).toString()));
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public ItemStack a(ItemStack paramamj, World paramaqu, EntityPlayer paramahd)
/*  63:    */   {
/*  64: 92 */     if (!paramaqu.isClient) {
/*  65: 93 */       a(paramamj, paramahd);
/*  66:    */     }
/*  67: 95 */     paramahd.a(paramamj);
/*  68: 96 */     paramahd.increaseStat(StatList.J[Item.b(this)]);
/*  69: 97 */     return paramamj;
/*  70:    */   }
/*  71:    */   
/*  72:    */   private void a(ItemStack paramamj, EntityPlayer paramahd)
/*  73:    */   {
/*  74:101 */     if ((paramamj == null) || (paramamj.getTagCompound() == null)) {
/*  75:102 */       return;
/*  76:    */     }
/*  77:104 */     NBTTagCompound localfn = paramamj.getTagCompound();
/*  78:105 */     if (localfn.getBoolean("resolved")) {
/*  79:106 */       return;
/*  80:    */     }
/*  81:108 */     localfn.setBoolean("resolved", true);
/*  82:109 */     if (!b(localfn)) {
/*  83:110 */       return;
/*  84:    */     }
/*  85:112 */     fv localfv = localfn.c("pages", 8);
/*  86:113 */     for (int i = 0; i < localfv.c(); i++)
/*  87:    */     {
/*  88:114 */       String str = localfv.f(i);
/*  89:    */       Object localObject;
/*  90:    */       try
/*  91:    */       {
/*  92:117 */         localObject = hp.a(str);
/*  93:118 */         localObject = hq.a(paramahd, (ho)localObject, paramahd);
/*  94:    */       }
/*  95:    */       catch (Exception localException)
/*  96:    */       {
/*  97:120 */         localObject = new hy(str);
/*  98:    */       }
/*  99:122 */       localfv.a(i, new gc(hp.a((ho)localObject)));
/* 100:    */     }
/* 101:124 */     localfn.setNBT("pages", localfv);
/* 102:125 */     if (((paramahd instanceof qw)) && (paramahd.bY() == paramamj))
/* 103:    */     {
/* 104:126 */       ajk localajk = paramahd.bi.a(paramahd.inventory, paramahd.inventory.c);
/* 105:127 */       ((qw)paramahd).a.a(new jh(0, localajk.e, paramamj));
/* 106:    */     }
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean f(ItemStack paramamj)
/* 110:    */   {
/* 111:133 */     return true;
/* 112:    */   }
/* 113:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     anr
 * JD-Core Version:    0.7.0.1
 */