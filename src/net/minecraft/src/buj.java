package net.minecraft.src;
/*   1:    */ import com.google.common.base.Strings;
/*   2:    */ import com.google.common.collect.ImmutableMap;
/*   3:    */ import com.google.common.collect.Lists;

/*   4:    */ import java.util.ArrayList;
/*   5:    */ import java.util.List;
import java.util.Map;
/*   6:    */ import java.util.Map.Entry;

/*   7:    */ import net.minecraft.client.ClientBrandRetriever;

/*   8:    */ import org.lwjgl.opengl.Display;
/*   9:    */ import org.lwjgl.opengl.GL11;
/*  10:    */ 
/*  11:    */ public class buj
/*  12:    */   extends bub
/*  13:    */ {
/*  14:    */   private final bsu a;
/*  15:    */   private final bty f;
/*  16:    */   
/*  17:    */   public buj(bsu parambsu)
/*  18:    */   {
/*  19: 43 */     this.a = parambsu;
/*  20: 44 */     this.f = parambsu.k;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(buf parambuf)
/*  24:    */   {
/*  25: 48 */     this.a.y.a("debug");
/*  26: 49 */     cjm.glPushMatrix();
/*  27:    */     
/*  28: 51 */     a();
/*  29: 52 */     b(parambuf);
/*  30:    */     
/*  31: 54 */     cjm.glPopMatrix();
/*  32: 55 */     this.a.y.b();
/*  33:    */   }
/*  34:    */   
/*  35:    */   private boolean d()
/*  36:    */   {
/*  37: 59 */     return (this.a.h.cp()) || (this.a.t.v);
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected void a()
/*  41:    */   {
/*  42: 63 */     List localList = b();
/*  43: 65 */     for (int i = 0; i < localList.size(); i++)
/*  44:    */     {
/*  45: 66 */       String str = (String)localList.get(i);
/*  46: 67 */       if (!Strings.isNullOrEmpty(str))
/*  47:    */       {
/*  48: 68 */         int j = this.f.a;
/*  49: 69 */         int k = this.f.a(str);
/*  50: 70 */         int m = 2;
/*  51: 71 */         int n = 2 + j * i;
/*  52: 72 */         a(1, n - 1, 2 + k + 1, n + j - 1, -1873784752);
/*  53: 73 */         this.f.a(str, 2, n, 14737632);
/*  54:    */       }
/*  55:    */     }
/*  56:    */   }
/*  57:    */   
/*  58:    */   protected void b(buf parambuf)
/*  59:    */   {
/*  60: 79 */     List localList = c();
/*  61: 81 */     for (int i = 0; i < localList.size(); i++)
/*  62:    */     {
/*  63: 82 */       String str = (String)localList.get(i);
/*  64: 83 */       if (!Strings.isNullOrEmpty(str))
/*  65:    */       {
/*  66: 84 */         int j = this.f.a;
/*  67: 85 */         int k = this.f.a(str);
/*  68: 86 */         int m = parambuf.a() - 2 - k;
/*  69: 87 */         int n = 2 + j * i;
/*  70: 88 */         a(m - 1, n - 1, m + k + 1, n + j - 1, -1873784752);
/*  71: 89 */         this.f.a(str, m, n, 14737632);
/*  72:    */       }
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   protected List b()
/*  77:    */   {
/*  78: 95 */     BlockPosition localdt = new BlockPosition(this.a.aa().xPos, this.a.aa().getAABB().minY, this.a.aa().zPos);
/*  79: 96 */     if (d()) {
/*  80: 97 */       return Lists.newArrayList(new String[] { "Minecraft 1.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.A, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("Chunk-relative: %d %d %d", new Object[] { Integer.valueOf(localdt.getX() & 0xF), Integer.valueOf(localdt.getY() & 0xF), Integer.valueOf(localdt.getZ() & 0xF) }) });
/*  81:    */     }
/*  82:109 */     Entity localwv = this.a.aa();
/*  83:110 */     EnumDirection localej = localwv.aO();
/*  84:111 */     String str = "Invalid";
/*  85:112 */     switch (buk.a[localej.ordinal()])
/*  86:    */     {
/*  87:    */     case 1: 
/*  88:114 */       str = "Towards negative Z";
/*  89:115 */       break;
/*  90:    */     case 2: 
/*  91:117 */       str = "Towards positive Z";
/*  92:118 */       break;
/*  93:    */     case 3: 
/*  94:120 */       str = "Towards negative X";
/*  95:121 */       break;
/*  96:    */     case 4: 
/*  97:123 */       str = "Towards positive X";
/*  98:    */     }
/*  99:127 */     ArrayList localArrayList = Lists.newArrayList(new String[] { "Minecraft 1.8 (" + this.a.c() + "/" + ClientBrandRetriever.getClientModName() + ")", this.a.A, this.a.g.f(), this.a.g.g(), "P: " + this.a.j.b() + ". T: " + this.a.f.z(), this.a.f.A(), "", String.format("XYZ: %.3f / %.5f / %.3f", new Object[] { Double.valueOf(this.a.aa().xPos), Double.valueOf(this.a.aa().getAABB().minY), Double.valueOf(this.a.aa().zPos) }), String.format("Block: %d %d %d", new Object[] { Integer.valueOf(localdt.getX()), Integer.valueOf(localdt.getY()), Integer.valueOf(localdt.getZ()) }), String.format("Chunk: %d %d %d in %d %d %d", new Object[] { Integer.valueOf(localdt.getX() & 0xF), Integer.valueOf(localdt.getY() & 0xF), Integer.valueOf(localdt.getZ() & 0xF), Integer.valueOf(localdt.getX() >> 4), Integer.valueOf(localdt.getY() >> 4), Integer.valueOf(localdt.getZ() >> 4) }), String.format("Facing: %s (%s) (%.1f / %.1f)", new Object[] { localej, str, Float.valueOf(MathUtils.wrapDegrees(localwv.yaw)), Float.valueOf(MathUtils.wrapDegrees(localwv.pitch)) }) });
/* 100:    */     Object localObject;
/* 101:141 */     if ((this.a.f != null) && (this.a.f.e(localdt)))
/* 102:    */     {
/* 103:142 */       localObject = this.a.f.getChunk(localdt);
/* 104:143 */       localArrayList.add("Biome: " + ((Chunk)localObject).a(localdt, this.a.f.v()).ah);
/* 105:144 */       localArrayList.add("Light: " + ((Chunk)localObject).a(localdt, 0) + " (" + ((Chunk)localObject).a(EnumSkyBlock.SKY, localdt) + " sky, " + ((Chunk)localObject).a(EnumSkyBlock.BLOCK, localdt) + " block)");
/* 106:145 */       vu localvu = this.a.f.E(localdt);
/* 107:146 */       if ((this.a.D()) && (this.a.F() != null))
/* 108:    */       {
/* 109:147 */         qw localqw = this.a.F().an().a(this.a.h.getUUID());
/* 110:148 */         if (localqw != null) {
/* 111:149 */           localvu = localqw.world.E(new BlockPosition(localqw));
/* 112:    */         }
/* 113:    */       }
/* 114:152 */       localArrayList.add(String.format("Local Difficulty: %.2f (Day %d)", new Object[] { Float.valueOf(localvu.b()), Long.valueOf(this.a.f.L() / 24000L) }));
/* 115:    */     }
/* 116:155 */     if ((this.a.o != null) && (this.a.o.a())) {
/* 117:156 */       localArrayList.add("Shader: " + this.a.o.f().b());
/* 118:    */     }
/* 119:159 */     if ((this.a.s != null) && (this.a.s.a == brv.BLOCK) && (this.a.s.a() != null))
/* 120:    */     {
/* 121:160 */       localObject = this.a.s.a();
/* 122:161 */       localArrayList.add(String.format("Looking at: %d %d %d", new Object[] { Integer.valueOf(((BlockPosition)localObject).getX()), Integer.valueOf(((BlockPosition)localObject).getY()), Integer.valueOf(((BlockPosition)localObject).getZ()) }));
/* 123:    */     }
/* 124:164 */     return localArrayList;
/* 125:    */   }
/* 126:    */   
/* 127:    */   protected List c()
/* 128:    */   {
/* 129:168 */     long l1 = Runtime.getRuntime().maxMemory();
/* 130:169 */     long l2 = Runtime.getRuntime().totalMemory();
/* 131:170 */     long l3 = Runtime.getRuntime().freeMemory();
/* 132:171 */     long l4 = l2 - l3;
/* 133:    */     
/* 134:173 */     ArrayList<String> localArrayList = Lists.newArrayList(new String[] { String.format("Java: %s %dbit", new Object[] { System.getProperty("java.version"), Integer.valueOf(this.a.S() ? 64 : 32) }), String.format("Mem: % 2d%% %03d/%03dMB", new Object[] { Long.valueOf(l4 * 100L / l1), Long.valueOf(a(l4)), Long.valueOf(a(l1)) }), String.format("Allocated: % 2d%% %03dMB", new Object[] { Long.valueOf(l2 * 100L / l1), Long.valueOf(a(l2)) }), "", String.format("Display: %dx%d (%s)", new Object[] { Integer.valueOf(Display.getWidth()), Integer.valueOf(Display.getHeight()), GL11.glGetString(7936) }), GL11.glGetString(7937), GL11.glGetString(7938) });
/* 135:183 */     if (d()) {
/* 136:184 */       return localArrayList;
/* 137:    */     }
/* 138:187 */     if ((this.a.s != null) && (this.a.s.a == brv.BLOCK) && (this.a.s.a() != null))
/* 139:    */     {
/* 140:188 */       BlockPosition localdt = this.a.s.a();
/* 141:189 */       Block localbec = this.a.f.getBlock(localdt);
/* 142:191 */       if (this.a.f.G() != WorldType.DEBUG_ALL_BLOCK_STATES) {
/* 143:192 */         localbec = localbec.getProto().a(localbec, this.a.f, localdt);
/* 144:    */       }
/* 145:195 */       localArrayList.add("");
/* 146:196 */       localArrayList.add(String.valueOf(ProtoBlock.c.c(localbec.getProto())));
/* 147:198 */       for (Map.Entry<IBlockData,Comparable> localEntry : localbec.b().entrySet())
/* 148:    */       {
/* 149:199 */         String str = ((Comparable)localEntry.getValue()).toString();
/* 150:201 */         if (localEntry.getValue() == Boolean.TRUE) {
/* 151:202 */           str = a.k + str;
/* 152:203 */         } else if (localEntry.getValue() == Boolean.FALSE) {
/* 153:204 */           str = a.m + str;
/* 154:    */         }
/* 155:207 */         localArrayList.add(((IBlockData)localEntry.getKey()).getName() + ": " + str);
/* 156:    */       }
/* 157:    */     }
/* 158:211 */     return localArrayList;
/* 159:    */   }
/* 160:    */   
/* 161:    */   private static long a(long paramLong)
/* 162:    */   {
/* 163:215 */     return paramLong / 1024L / 1024L;
/* 164:    */   }
/* 165:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     buj
 * JD-Core Version:    0.7.0.1
 */