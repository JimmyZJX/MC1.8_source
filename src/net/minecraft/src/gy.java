package net.minecraft.src;
/*   1:    */ import com.google.common.collect.BiMap;
/*   2:    */ import com.google.common.collect.HashBiMap;
/*   3:    */ import com.google.common.collect.Maps;

/*   4:    */ import gnu.trove.map.TIntObjectMap;
/*   5:    */ import gnu.trove.map.hash.TIntObjectHashMap;

/*   6:    */ import java.util.Map;

/*   7:    */ import org.apache.logging.log4j.LogManager;
/*   9:    */ 
/*  10:    */ public enum gy
/*  11:    */ { a(-1){
					{
						/*  6:24 */     a(ie.a, mz.class);
					}
				},
				b(0){
					{
						/*   6: 27 */     a(ie.b, jp.class);
						/*   7: 28 */     a(ie.b, jw.class);
						/*   8: 29 */     a(ie.b, iz.class);
						/*   9: 30 */     a(ie.b, li.class);
						/*  10: 31 */     a(ie.b, la.class);
						/*  11: 32 */     a(ie.b, lh.class);
						/*  12: 33 */     a(ie.b, lc.class);
						/*  13: 34 */     a(ie.b, kp.class);
						/*  14: 35 */     a(ie.b, ii.class);
						/*  15: 36 */     a(ie.b, kv.class);
						/*  16: 37 */     a(ie.b, kl.class);
						/*  17: 38 */     a(ie.b, ir.class);
						/*  18: 39 */     a(ie.b, iq.class);
						/*  19: 40 */     a(ie.b, ln.class);
						/*  20: 41 */     a(ie.b, il.class);
						/*  21: 42 */     a(ie.b, io.class);
						/*  22: 43 */     a(ie.b, ip.class);
						/*  23: 44 */     a(ie.b, im.class);
						/*  24: 45 */     a(ie.b, kz.class);
						/*  25: 46 */     a(ie.b, km.class);
						/*  26: 47 */     a(ie.b, jy.class);
						/*  27: 48 */     a(ie.b, jz.class);
						/*  28: 49 */     a(ie.b, kb.class);
						/*  29: 50 */     a(ie.b, ka.class);
						/*  30: 51 */     a(ie.b, lo.class);
						/*  31: 52 */     a(ie.b, kq.class);
						/*  32: 53 */     a(ie.b, jk.class);
						/*  33: 54 */     a(ie.b, ky.class);
						/*  34: 55 */     a(ie.b, kx.class);
						/*  35: 56 */     a(ie.b, lr.class);
						/*  36: 57 */     a(ie.b, kn.class);
						/*  37: 58 */     a(ie.b, lb.class);
						/*  38: 59 */     a(ie.b, lp.class);
						/*  39: 60 */     a(ie.b, jq.class);
						/*  40: 61 */     a(ie.b, ja.class);
						/*  41: 62 */     a(ie.b, iw.class);
						/*  42: 63 */     a(ie.b, iv.class);
						/*  43: 64 */     a(ie.b, it.class);
						/*  44: 65 */     a(ie.b, js.class);
						/*  45: 66 */     a(ie.b, jm.class);
						/*  46: 67 */     a(ie.b, jt.class);
						/*  47: 68 */     a(ie.b, jv.class);
						/*  48: 69 */     a(ie.b, ju.class);
						/*  49: 70 */     a(ie.b, jo.class);
						/*  50: 71 */     a(ie.b, in.class);
						/*  51: 72 */     a(ie.b, je.class);
						/*  52: 73 */     a(ie.b, jd.class);
						/*  53: 74 */     a(ie.b, jh.class);
						/*  54: 75 */     a(ie.b, jf.class);
						/*  55: 76 */     a(ie.b, jg.class);
						/*  56: 77 */     a(ie.b, jc.class);
						/*  57: 78 */     a(ie.b, ll.class);
						/*  58: 79 */     a(ie.b, jx.class);
						/*  59: 80 */     a(ie.b, iu.class);
						/*  60: 81 */     a(ie.b, kc.class);
						/*  61: 82 */     a(ie.b, is.class);
						/*  62: 83 */     a(ie.b, kh.class);
						/*  63: 84 */     a(ie.b, kd.class);
						/*  64: 85 */     a(ie.b, iy.class);
						/*  65: 86 */     a(ie.b, ld.class);
						/*  66: 87 */     a(ie.b, lf.class);
						/*  67: 88 */     a(ie.b, kw.class);
						/*  68: 89 */     a(ie.b, le.class);
						/*  69: 90 */     a(ie.b, ji.class);
						/*  70: 91 */     a(ie.b, jj.class);
						/*  71: 92 */     a(ie.b, ix.class);
						/*  72: 93 */     a(ie.b, ke.class);
						/*  73: 94 */     a(ie.b, ku.class);
						/*  74: 95 */     a(ie.b, kr.class);
						/*  75: 96 */     a(ie.b, lj.class);
						/*  76: 97 */     a(ie.b, jn.class);
						/*  77: 98 */     a(ie.b, lm.class);
						/*  78: 99 */     a(ie.b, ko.class);
						/*  79:100 */     a(ie.b, jl.class);
						/*  80:    */     
						/*  81:102 */     a(ie.a, mf.class);
						/*  82:103 */     a(ie.a, lu.class);
						/*  83:104 */     a(ie.a, md.class);
						/*  84:105 */     a(ie.a, mg.class);
						/*  85:106 */     a(ie.a, mh.class);
						/*  86:107 */     a(ie.a, mj.class);
						/*  87:108 */     a(ie.a, mi.class);
						/*  88:109 */     a(ie.a, ml.class);
						/*  89:110 */     a(ie.a, mx.class);
						/*  90:111 */     a(ie.a, ms.class);
						/*  91:112 */     a(ie.a, mv.class);
						/*  92:113 */     a(ie.a, mn.class);
						/*  93:114 */     a(ie.a, mp.class);
						/*  94:115 */     a(ie.a, mb.class);
						/*  95:116 */     a(ie.a, ma.class);
						/*  96:117 */     a(ie.a, ly.class);
						/*  97:118 */     a(ie.a, mt.class);
						/*  98:119 */     a(ie.a, lz.class);
						/*  99:120 */     a(ie.a, mu.class);
						/* 100:121 */     a(ie.a, mk.class);
						/* 101:122 */     a(ie.a, lt.class);
						/* 102:123 */     a(ie.a, lx.class);
						/* 103:124 */     a(ie.a, lv.class);
						/* 104:125 */     a(ie.a, mc.class);
						/* 105:126 */     a(ie.a, mw.class);
						/* 106:127 */     a(ie.a, mq.class);
					}
				},
				c(1){
					{
						/*   6:130 */     a(ie.a, nx.class);
						/*   7:131 */     a(ie.b, no.class);
						/*   8:132 */     a(ie.a, nw.class);
						/*   9:133 */     a(ie.b, nn.class);
					}
				},
				d(2){
					{
						/*   6:136 */     a(ie.b, ng.class);
						/*   7:137 */     a(ie.b, ne.class);
						/*   8:138 */     a(ie.b, nd.class);
						/*   9:139 */     a(ie.b, nf.class);
						/*  10:    */     
						/*  11:141 */     a(ie.a, ni.class);
						/*  12:142 */     a(ie.a, nj.class);
					}
				};
/*  12:    */   private static final TIntObjectMap<gy> e;
/*  13:    */   private static final Map<Class<? extends id<?>>,gy> f;
/*  14:    */   private final int g;
/*  15:148 */   private final Map<ie,BiMap<Integer,Class<? extends id<?>>>> h = Maps.newEnumMap(ie.class);
/*  16:    */   
/*  17:    */   private gy(int paramInt)
/*  18:    */   {
/*  19:151 */     this.g = paramInt;
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected gy a(ie paramie, Class<? extends id<?>> paramClass)
/*  23:    */   {
/*  24:155 */     BiMap<Integer,Class<? extends id<?>>> localObject = this.h.get(paramie);
/*  25:157 */     if (localObject == null)
/*  26:    */     {
/*  27:158 */       localObject = HashBiMap.create();
/*  28:159 */       this.h.put(paramie, localObject);
/*  29:    */     }
/*  30:162 */     if (localObject.containsValue(paramClass))
/*  31:    */     {
/*  32:163 */       String str = paramie + " packet " + paramClass + " is already known to ID " + localObject.inverse().get(paramClass);
/*  33:164 */       LogManager.getLogger().fatal(str);
/*  34:165 */       throw new IllegalArgumentException(str);
/*  35:    */     }
/*  36:168 */     localObject.put(Integer.valueOf(localObject.size()), paramClass);
/*  37:169 */     return this;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Integer a(ie paramie, id<?> paramid)
/*  41:    */   {
/*  42:173 */     return this.h.get(paramie).inverse().get(paramid.getClass());
/*  43:    */   }
/*  44:    */   
/*  45:    */   public id<?> a(ie paramie, int paramInt) throws InstantiationException, IllegalAccessException
/*  46:    */   {
/*  47:178 */     Class<? extends id<?>> localClass = this.h.get(paramie).get(Integer.valueOf(paramInt));
/*  48:180 */     if (localClass == null) {
/*  49:181 */       return null;
/*  50:    */     }
/*  51:183 */     return localClass.newInstance();
/*  52:    */   }
/*  53:    */   
/*  54:    */   public int a()
/*  55:    */   {
/*  56:188 */     return this.g;
/*  57:    */   }
/*  58:    */   
/*  59:    */   static
/*  60:    */   {
/*  61:145 */     e = new TIntObjectHashMap<gy>();
/*  62:146 */     f = Maps.newHashMap();
/*  63:    */     
/*  64:192 */     for (gy localgy : values())
/*  65:    */     {
/*  66:193 */       e.put(localgy.a(), localgy);
/*  67:195 */       for (ie localie : localgy.h.keySet()) {
/*  68:196 */         for (Class<? extends id<?>> localClass : (localgy.h.get(localie)).values())
/*  69:    */         {
/*  70:197 */           if ((f.containsKey(localClass)) && (f.get(localClass) != localgy)) {
/*  71:198 */             throw new Error("Packet " + localClass + " is already assigned to protocol " + f.get(localClass) + " - can't reassign to " + localgy);
/*  72:    */           }
/*  73:    */           try
/*  74:    */           {
/*  75:202 */             localClass.newInstance();
/*  76:    */           }
/*  77:    */           catch (Throwable localThrowable)
/*  78:    */           {
/*  79:204 */             throw new Error("Packet " + localClass + " fails instantiation checks! " + localClass);
/*  80:    */           }
/*  81:207 */           f.put(localClass, localgy);
/*  82:    */         }
/*  83:    */       }
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public static gy a(int paramInt)
/*  88:    */   {
/*  89:214 */     return e.get(paramInt);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public static gy a(id<?> paramid)
/*  93:    */   {
/*  94:218 */     return f.get(paramid.getClass());
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     gy
 * JD-Core Version:    0.7.0.1
 */