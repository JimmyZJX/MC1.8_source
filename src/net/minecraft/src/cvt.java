package net.minecraft.src;
/*   1:    */ import com.google.common.base.Joiner;
/*   2:    */ import com.google.common.collect.Iterables;
/*   3:    */ import com.google.common.collect.Lists;
/*   4:    */ import com.google.common.collect.Maps;
/*   5:    */ import com.google.common.collect.Sets;

/*   6:    */ import java.io.FileNotFoundException;
import java.io.IOException;
/*   7:    */ import java.util.List;
/*   8:    */ import java.util.Map;
/*   9:    */ import java.util.Set;

/*  10:    */ import org.apache.logging.log4j.LogManager;
/*  11:    */ import org.apache.logging.log4j.Logger;
/*  12:    */ 
/*  13:    */ public class cvt
/*  14:    */   implements cvi
/*  15:    */ {
/*  16: 21 */   private static final Logger a = LogManager.getLogger();
/*  17: 22 */   private static final Joiner b = Joiner.on(", ");
/*  18: 23 */   private final Map c = Maps.newHashMap();
/*  19: 24 */   private final List<cvl> d = Lists.newArrayList();
/*  20: 25 */   private final Set e = Sets.newLinkedHashSet();
/*  21:    */   private final cwk f;
/*  22:    */   
/*  23:    */   public cvt(cwk paramcwk)
/*  24:    */   {
/*  25: 29 */     this.f = paramcwk;
/*  26:    */   }
/*  27:    */   
/*  28:    */   public void a(cvm paramcvm)
/*  29:    */   {
/*  30: 34 */     for (String str : paramcvm.c())
/*  31:    */     {
/*  32: 35 */       this.e.add(str);
/*  33: 36 */       cvc localcvc = (cvc)this.c.get(str);
/*  34: 37 */       if (localcvc == null)
/*  35:    */       {
/*  36: 38 */         localcvc = new cvc(this.f);
/*  37: 39 */         this.c.put(str, localcvc);
/*  38:    */       }
/*  39: 41 */       localcvc.a(paramcvm);
/*  40:    */     }
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Set a()
/*  44:    */   {
/*  45: 47 */     return this.e;
/*  46:    */   }
/*  47:    */   
/*  48:    */   public cvj a(oa paramoa) throws IOException
/*  49:    */   {
/*  50: 52 */     cvk localcvk = (cvk)this.c.get(paramoa.b());
/*  51: 54 */     if (localcvk != null) {
/*  52: 55 */       return localcvk.a(paramoa);
/*  53:    */     }
/*  54: 58 */     throw new FileNotFoundException(paramoa.toString());
/*  55:    */   }
/*  56:    */   
/*  57:    */   public List b(oa paramoa) throws IOException
/*  58:    */   {
/*  59: 63 */     cvk localcvk = (cvk)this.c.get(paramoa.b());
/*  60: 65 */     if (localcvk != null) {
/*  61: 66 */       return localcvk.b(paramoa);
/*  62:    */     }
/*  63: 69 */     throw new FileNotFoundException(paramoa.toString());
/*  64:    */   }
/*  65:    */   
/*  66:    */   private void b()
/*  67:    */   {
/*  68: 73 */     this.c.clear();
/*  69: 74 */     this.e.clear();
/*  70:    */   }
/*  71:    */   
/*  72:    */   public void a(List<cvm> paramList)
/*  73:    */   {
/*  74: 79 */     b();
/*  75:    */     
/*  76: 81 */     a.info("Reloading ResourceManager: " + b.join(Iterables.transform(paramList, new cvu(this))));
/*  77: 88 */     for (cvm localcvm : paramList) {
/*  78: 89 */       a(localcvm);
/*  79:    */     }
/*  80: 92 */     c();
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void a(cvl paramcvl)
/*  84:    */   {
/*  85: 97 */     this.d.add(paramcvl);
/*  86:    */     
/*  87: 99 */     paramcvl.a(this);
/*  88:    */   }
/*  89:    */   
/*  90:    */   private void c()
/*  91:    */   {
/*  92:103 */     for (cvl localcvl : this.d) {
/*  93:104 */       localcvl.a(this);
/*  94:    */     }
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cvt
 * JD-Core Version:    0.7.0.1
 */