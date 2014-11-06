package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Lists;

/*   2:    */ import java.util.ArrayList;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.List;
import java.util.Map;
/*   7:    */ import java.util.TreeMap;
/*   8:    */ 
/*   9:    */ public class bxm
/*  10:    */   extends bxf
/*  11:    */ {
/*  12:    */   private final bxf a;
/*  13:    */   private final bto f;
/*  14: 19 */   private final List<String> g = Lists.newArrayList();
/*  15: 20 */   private final List<String> h = Lists.newArrayList();
/*  16:    */   private String i;
/*  17:    */   private String[] r;
/*  18:    */   private bxn s;
/*  19:    */   private bug t;
/*  20:    */   
/*  21:    */   public bxm(bxf parambxf, bto parambto)
/*  22:    */   {
/*  23: 27 */     this.a = parambxf;
/*  24: 28 */     this.f = parambto;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public void b()
/*  28:    */   {
/*  29: 33 */     this.i = cwc.a("options.snooper.title", new Object[0]);
/*  30: 34 */     String str = cwc.a("options.snooper.desc", new Object[0]);
/*  31: 35 */     ArrayList<String> localArrayList = Lists.newArrayList();
/*  32: 37 */     for (Iterator<String> localIterator = this.q.c(str, this.l - 30).iterator(); localIterator.hasNext();)
/*  33:    */     {
/*  34: 37 */       String localObject = (String)localIterator.next();
/*  35: 38 */       localArrayList.add(localObject);
/*  36:    */     }
/*  37: 41 */     this.r = ((String[])localArrayList.toArray(new String[0]));
/*  38:    */     
/*  39: 43 */     this.g.clear();
/*  40: 44 */     this.h.clear();
/*  41:    */     
/*  42: 46 */     this.n.add(this.t = new bug(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(btr.u)));
/*  43: 47 */     this.n.add(new bug(2, this.l / 2 + 2, this.m - 30, 150, 20, cwc.a("gui.done", new Object[0])));
/*  44:    */     
/*  45: 49 */     int j = (this.j.F() != null) && (this.j.F().at() != null) ? 1 : 0;
/*  46: 51 */     for (Iterator<Map.Entry<String,String>> localObject = new TreeMap<String,String>(this.j.H().c()).entrySet().iterator(); localObject.hasNext();)
/*  47:    */     {
/*  48: 51 */       Map.Entry<String,String> localEntry = localObject.next();
/*  49: 52 */       this.g.add((j != 0 ? "C " : "") + (String)localEntry.getKey());
/*  50: 53 */       this.h.add(this.q.a((String)localEntry.getValue(), this.l - 220));
/*  51:    */     }
/*  52:    */     
/*  53: 56 */     if (j != 0) {
/*  54: 57 */       for (Iterator<Map.Entry<String,String>>localObject = new TreeMap<String,String>(this.j.F().at().c()).entrySet().iterator(); localObject.hasNext();)
/*  55:    */       {
/*  56: 57 */         Map.Entry<String,String> localEntry = localObject.next();
/*  57: 58 */         this.g.add("S " + (String)localEntry.getKey());
/*  58: 59 */         this.h.add(this.q.a((String)localEntry.getValue(), this.l - 220));
/*  59:    */       }
/*  60:    */     }
/*  61: 63 */     this.s = new bxn(this);
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void k()
/*  65:    */   {
/*  66: 68 */     super.k();
/*  67: 69 */     this.s.p();
/*  68:    */   }
/*  69:    */   
/*  70:    */   protected void a(bug parambug)
/*  71:    */   {
/*  72: 74 */     if (!parambug.l) {
/*  73: 75 */       return;
/*  74:    */     }
/*  75: 78 */     if (parambug.k == 2)
/*  76:    */     {
/*  77: 79 */       this.f.b();
/*  78: 80 */       this.f.b();
/*  79: 81 */       this.j.a(this.a);
/*  80:    */     }
/*  81: 84 */     if (parambug.k == 1)
/*  82:    */     {
/*  83: 85 */       this.f.a(btr.u, 1);
/*  84: 86 */       this.t.j = this.f.c(btr.u);
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  89:    */   {
/*  90: 92 */     c();
/*  91:    */     
/*  92: 94 */     this.s.a(paramInt1, paramInt2, paramFloat);
/*  93: 95 */     a(this.q, this.i, this.l / 2, 8, 16777215);
/*  94:    */     
/*  95: 97 */     int j = 22;
/*  96: 98 */     for (String str : this.r)
/*  97:    */     {
/*  98: 99 */       a(this.q, str, this.l / 2, j, 8421504);
/*  99:100 */       j += this.q.a;
/* 100:    */     }
/* 101:103 */     super.a(paramInt1, paramInt2, paramFloat);
/* 102:    */   }
				static List<String> a(bxm arg0) {return arg0.g;}
				static List<String> b(bxm arg0) {return arg0.h;}
/* 103:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bxm
 * JD-Core Version:    0.7.0.1
 */