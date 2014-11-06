package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class cxn
/*   5:    */ {
/*   6: 66 */   private final List<clt> a = Lists.newArrayList();
/*   7: 67 */   private final List<List<clt>> b = Lists.newArrayListWithCapacity(6);
/*   8:    */   private final boolean c;
/*   9:    */   private cue d;
/*  10:    */   private boolean e;
/*  11:    */   private cmx f;
/*  12:    */   
/*  13:    */   public cxn(cmc paramcmc)
/*  14:    */   {
/*  15: 79 */     this(paramcmc.b(), paramcmc.c(), new cmx(paramcmc.g(), paramcmc.h(), paramcmc.i(), paramcmc.j()));
/*  16:    */   }
/*  17:    */   
/*  18:    */   public cxn(cxe paramcxe, cue paramcue)
/*  19:    */   {
/*  20: 83 */     this(paramcxe.b(), paramcxe.c(), paramcxe.f());
/*  21: 84 */     this.d = paramcxe.e();
/*  22: 85 */     for (EnumDirection localej : EnumDirection.values()) {
/*  23: 86 */       a(paramcxe, paramcue, localej);
/*  24:    */     }
/*  25: 88 */     a(paramcxe, paramcue);
/*  26:    */   }
/*  27:    */   
/*  28:    */   private void a(cxe paramcxe, cue paramcue, EnumDirection paramej)
/*  29:    */   {
/*  30: 92 */     for (clt localclt : paramcxe.a(paramej)) {
/*  31: 93 */       a(paramej, new cmn(localclt, paramcue));
/*  32:    */     }
/*  33:    */   }
/*  34:    */   
/*  35:    */   private void a(cxe paramcxe, cue paramcue)
/*  36:    */   {
/*  37: 98 */     for (clt localclt : paramcxe.a()) {
/*  38: 99 */       a(new cmn(localclt, paramcue));
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   private cxn(boolean paramBoolean1, boolean paramBoolean2, cmx paramcmx)
/*  43:    */   {
/*  44: 69 */     for (@SuppressWarnings("unused") EnumDirection localej : EnumDirection.values()) {
/*  45: 70 */       this.b.add(Lists.<clt>newArrayList());
/*  46:    */     }
/*  47:104 */     this.c = paramBoolean1;
/*  48:105 */     this.e = paramBoolean2;
/*  49:106 */     this.f = paramcmx;
/*  50:    */   }
/*  51:    */   
/*  52:    */   public cxn a(EnumDirection paramej, clt paramclt)
/*  53:    */   {
/*  54:110 */     this.b.get(paramej.ordinal()).add(paramclt);
/*  55:111 */     return this;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public cxn a(clt paramclt)
/*  59:    */   {
/*  60:115 */     this.a.add(paramclt);
/*  61:116 */     return this;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public cxn a(cue paramcue)
/*  65:    */   {
/*  66:120 */     this.d = paramcue;
/*  67:    */     
/*  68:122 */     return this;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public cxe b()
/*  72:    */   {
/*  73:130 */     if (this.d == null) {
/*  74:131 */       throw new RuntimeException("Missing particle!");
/*  75:    */     }
/*  76:133 */     return new cxm(this.a, this.b, this.c, this.e, this.d, this.f);
/*  77:    */   }
/*  78:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cxn
 * JD-Core Version:    0.7.0.1
 */