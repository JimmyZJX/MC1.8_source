package net.minecraft.src;
/*   1:    */ import com.google.gson.JsonDeserializationContext;
/*   2:    */ import com.google.gson.JsonDeserializer;
/*   3:    */ import com.google.gson.JsonElement;
/*   4:    */ import com.google.gson.JsonObject;
/*   5:    */ import com.google.gson.JsonSerializationContext;
/*   6:    */ import com.google.gson.JsonSerializer;
/*   7:    */ import java.lang.reflect.Type;
/*   8:    */ 
/*   9:    */ public class bgo
/*  10:    */   implements JsonDeserializer<bgn>, JsonSerializer<bgn>
/*  11:    */ {
/*  12:    */   public bgn deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext)
/*  13:    */   {
/*  14:749 */     JsonObject localJsonObject = paramJsonElement.getAsJsonObject();
/*  15:    */     
/*  16:751 */     bgn localbgn = new bgn();
/*  17:    */     try
/*  18:    */     {
/*  19:754 */       localbgn.b = uh.a(localJsonObject, "coordinateScale", localbgn.b);
/*  20:755 */       localbgn.c = uh.a(localJsonObject, "heightScale", localbgn.c);
/*  21:756 */       localbgn.e = uh.a(localJsonObject, "lowerLimitScale", localbgn.e);
/*  22:757 */       localbgn.d = uh.a(localJsonObject, "upperLimitScale", localbgn.d);
/*  23:758 */       localbgn.f = uh.a(localJsonObject, "depthNoiseScaleX", localbgn.f);
/*  24:759 */       localbgn.g = uh.a(localJsonObject, "depthNoiseScaleZ", localbgn.g);
/*  25:760 */       localbgn.h = uh.a(localJsonObject, "depthNoiseScaleExponent", localbgn.h);
/*  26:761 */       localbgn.i = uh.a(localJsonObject, "mainNoiseScaleX", localbgn.i);
/*  27:762 */       localbgn.j = uh.a(localJsonObject, "mainNoiseScaleY", localbgn.j);
/*  28:763 */       localbgn.k = uh.a(localJsonObject, "mainNoiseScaleZ", localbgn.k);
/*  29:764 */       localbgn.l = uh.a(localJsonObject, "baseSize", localbgn.l);
/*  30:765 */       localbgn.m = uh.a(localJsonObject, "stretchY", localbgn.m);
/*  31:766 */       localbgn.n = uh.a(localJsonObject, "biomeDepthWeight", localbgn.n);
/*  32:767 */       localbgn.o = uh.a(localJsonObject, "biomeDepthOffset", localbgn.o);
/*  33:768 */       localbgn.p = uh.a(localJsonObject, "biomeScaleWeight", localbgn.p);
/*  34:769 */       localbgn.q = uh.a(localJsonObject, "biomeScaleOffset", localbgn.q);
/*  35:770 */       localbgn.r = uh.a(localJsonObject, "seaLevel", localbgn.r);
/*  36:    */       
/*  37:772 */       localbgn.s = uh.a(localJsonObject, "useCaves", localbgn.s);
/*  38:773 */       localbgn.t = uh.a(localJsonObject, "useDungeons", localbgn.t);
/*  39:774 */       localbgn.u = uh.a(localJsonObject, "dungeonChance", localbgn.u);
/*  40:775 */       localbgn.v = uh.a(localJsonObject, "useStrongholds", localbgn.v);
/*  41:776 */       localbgn.w = uh.a(localJsonObject, "useVillages", localbgn.w);
/*  42:777 */       localbgn.x = uh.a(localJsonObject, "useMineShafts", localbgn.x);
/*  43:778 */       localbgn.y = uh.a(localJsonObject, "useTemples", localbgn.y);
/*  44:779 */       localbgn.z = uh.a(localJsonObject, "useMonuments", localbgn.z);
/*  45:780 */       localbgn.A = uh.a(localJsonObject, "useRavines", localbgn.A);
/*  46:781 */       localbgn.B = uh.a(localJsonObject, "useWaterLakes", localbgn.B);
/*  47:782 */       localbgn.C = uh.a(localJsonObject, "waterLakeChance", localbgn.C);
/*  48:783 */       localbgn.D = uh.a(localJsonObject, "useLavaLakes", localbgn.D);
/*  49:784 */       localbgn.E = uh.a(localJsonObject, "lavaLakeChance", localbgn.E);
/*  50:785 */       localbgn.F = uh.a(localJsonObject, "useLavaOceans", localbgn.F);
/*  51:    */       
/*  52:787 */       localbgn.G = uh.a(localJsonObject, "fixedBiome", localbgn.G);
/*  53:788 */       if ((localbgn.G >= 38) || (localbgn.G < -1)) {
/*  54:789 */         localbgn.G = -1;
/*  55:790 */       } else if (localbgn.G >= arm.x.az) {
/*  56:791 */         localbgn.G += 2;
/*  57:    */       }
/*  58:793 */       localbgn.H = uh.a(localJsonObject, "biomeSize", localbgn.H);
/*  59:794 */       localbgn.I = uh.a(localJsonObject, "riverSize", localbgn.I);
/*  60:    */       
/*  61:796 */       localbgn.dirtRadius = uh.a(localJsonObject, "dirtSize", localbgn.dirtRadius);
/*  62:797 */       localbgn.dirtPerChunk = uh.a(localJsonObject, "dirtCount", localbgn.dirtPerChunk);
/*  63:798 */       localbgn.L = uh.a(localJsonObject, "dirtMinHeight", localbgn.L);
/*  64:799 */       localbgn.M = uh.a(localJsonObject, "dirtMaxHeight", localbgn.M);
/*  65:800 */       localbgn.N = uh.a(localJsonObject, "gravelSize", localbgn.N);
/*  66:801 */       localbgn.O = uh.a(localJsonObject, "gravelCount", localbgn.O);
/*  67:802 */       localbgn.P = uh.a(localJsonObject, "gravelMinHeight", localbgn.P);
/*  68:803 */       localbgn.Q = uh.a(localJsonObject, "gravelMaxHeight", localbgn.Q);
/*  69:804 */       localbgn.R = uh.a(localJsonObject, "graniteSize", localbgn.R);
/*  70:805 */       localbgn.S = uh.a(localJsonObject, "graniteCount", localbgn.S);
/*  71:806 */       localbgn.T = uh.a(localJsonObject, "graniteMinHeight", localbgn.T);
/*  72:807 */       localbgn.U = uh.a(localJsonObject, "graniteMaxHeight", localbgn.U);
/*  73:808 */       localbgn.V = uh.a(localJsonObject, "dioriteSize", localbgn.V);
/*  74:809 */       localbgn.W = uh.a(localJsonObject, "dioriteCount", localbgn.W);
/*  75:810 */       localbgn.X = uh.a(localJsonObject, "dioriteMinHeight", localbgn.X);
/*  76:811 */       localbgn.Y = uh.a(localJsonObject, "dioriteMaxHeight", localbgn.Y);
/*  77:812 */       localbgn.Z = uh.a(localJsonObject, "andesiteSize", localbgn.Z);
/*  78:813 */       localbgn.aa = uh.a(localJsonObject, "andesiteCount", localbgn.aa);
/*  79:814 */       localbgn.ab = uh.a(localJsonObject, "andesiteMinHeight", localbgn.ab);
/*  80:815 */       localbgn.ac = uh.a(localJsonObject, "andesiteMaxHeight", localbgn.ac);
/*  81:816 */       localbgn.ad = uh.a(localJsonObject, "coalSize", localbgn.ad);
/*  82:817 */       localbgn.ae = uh.a(localJsonObject, "coalCount", localbgn.ae);
/*  83:818 */       localbgn.af = uh.a(localJsonObject, "coalMinHeight", localbgn.af);
/*  84:819 */       localbgn.ag = uh.a(localJsonObject, "coalMaxHeight", localbgn.ag);
/*  85:820 */       localbgn.ah = uh.a(localJsonObject, "ironSize", localbgn.ah);
/*  86:821 */       localbgn.ai = uh.a(localJsonObject, "ironCount", localbgn.ai);
/*  87:822 */       localbgn.aj = uh.a(localJsonObject, "ironMinHeight", localbgn.aj);
/*  88:823 */       localbgn.ak = uh.a(localJsonObject, "ironMaxHeight", localbgn.ak);
/*  89:824 */       localbgn.al = uh.a(localJsonObject, "goldSize", localbgn.al);
/*  90:825 */       localbgn.am = uh.a(localJsonObject, "goldCount", localbgn.am);
/*  91:826 */       localbgn.an = uh.a(localJsonObject, "goldMinHeight", localbgn.an);
/*  92:827 */       localbgn.ao = uh.a(localJsonObject, "goldMaxHeight", localbgn.ao);
/*  93:828 */       localbgn.redStoneRadius = uh.a(localJsonObject, "redstoneSize", localbgn.redStoneRadius);
/*  94:829 */       localbgn.redstonePerChunk = uh.a(localJsonObject, "redstoneCount", localbgn.redstonePerChunk);
/*  95:830 */       localbgn.redstoneY1 = uh.a(localJsonObject, "redstoneMinHeight", localbgn.redstoneY1);
/*  96:831 */       localbgn.redstoneY2 = uh.a(localJsonObject, "redstoneMaxHeight", localbgn.redstoneY2);
/*  97:832 */       localbgn.diamondRadius = uh.a(localJsonObject, "diamondSize", localbgn.diamondRadius);
/*  98:833 */       localbgn.diamondPerChunk = uh.a(localJsonObject, "diamondCount", localbgn.diamondPerChunk);
/*  99:834 */       localbgn.diamondY1 = uh.a(localJsonObject, "diamondMinHeight", localbgn.diamondY1);
/* 100:835 */       localbgn.diamondY2 = uh.a(localJsonObject, "diamondMaxHeight", localbgn.diamondY2);
/* 101:836 */       localbgn.lapisRadius = uh.a(localJsonObject, "lapisSize", localbgn.lapisRadius);
/* 102:837 */       localbgn.lapisPerChunk = uh.a(localJsonObject, "lapisCount", localbgn.lapisPerChunk);
/* 103:838 */       localbgn.az = uh.a(localJsonObject, "lapisCenterHeight", localbgn.az);
/* 104:839 */       localbgn.aA = uh.a(localJsonObject, "lapisSpread", localbgn.aA);
/* 105:    */     }
/* 106:    */     catch (Exception localException) {}
/* 107:844 */     return localbgn;
/* 108:    */   }
/* 109:    */   
/* 110:    */   public JsonElement serialize(bgn parambgn, Type paramType, JsonSerializationContext paramJsonSerializationContext)
/* 111:    */   {
/* 112:849 */     JsonObject localJsonObject = new JsonObject();
/* 113:    */     
/* 114:851 */     localJsonObject.addProperty("coordinateScale", Float.valueOf(parambgn.b));
/* 115:852 */     localJsonObject.addProperty("heightScale", Float.valueOf(parambgn.c));
/* 116:853 */     localJsonObject.addProperty("lowerLimitScale", Float.valueOf(parambgn.e));
/* 117:854 */     localJsonObject.addProperty("upperLimitScale", Float.valueOf(parambgn.d));
/* 118:855 */     localJsonObject.addProperty("depthNoiseScaleX", Float.valueOf(parambgn.f));
/* 119:856 */     localJsonObject.addProperty("depthNoiseScaleZ", Float.valueOf(parambgn.g));
/* 120:857 */     localJsonObject.addProperty("depthNoiseScaleExponent", Float.valueOf(parambgn.h));
/* 121:858 */     localJsonObject.addProperty("mainNoiseScaleX", Float.valueOf(parambgn.i));
/* 122:859 */     localJsonObject.addProperty("mainNoiseScaleY", Float.valueOf(parambgn.j));
/* 123:860 */     localJsonObject.addProperty("mainNoiseScaleZ", Float.valueOf(parambgn.k));
/* 124:861 */     localJsonObject.addProperty("baseSize", Float.valueOf(parambgn.l));
/* 125:862 */     localJsonObject.addProperty("stretchY", Float.valueOf(parambgn.m));
/* 126:863 */     localJsonObject.addProperty("biomeDepthWeight", Float.valueOf(parambgn.n));
/* 127:864 */     localJsonObject.addProperty("biomeDepthOffset", Float.valueOf(parambgn.o));
/* 128:865 */     localJsonObject.addProperty("biomeScaleWeight", Float.valueOf(parambgn.p));
/* 129:866 */     localJsonObject.addProperty("biomeScaleOffset", Float.valueOf(parambgn.q));
/* 130:867 */     localJsonObject.addProperty("seaLevel", Integer.valueOf(parambgn.r));
/* 131:    */     
/* 132:869 */     localJsonObject.addProperty("useCaves", Boolean.valueOf(parambgn.s));
/* 133:870 */     localJsonObject.addProperty("useDungeons", Boolean.valueOf(parambgn.t));
/* 134:871 */     localJsonObject.addProperty("dungeonChance", Integer.valueOf(parambgn.u));
/* 135:872 */     localJsonObject.addProperty("useStrongholds", Boolean.valueOf(parambgn.v));
/* 136:873 */     localJsonObject.addProperty("useVillages", Boolean.valueOf(parambgn.w));
/* 137:874 */     localJsonObject.addProperty("useMineShafts", Boolean.valueOf(parambgn.x));
/* 138:875 */     localJsonObject.addProperty("useTemples", Boolean.valueOf(parambgn.y));
/* 139:876 */     localJsonObject.addProperty("useMonuments", Boolean.valueOf(parambgn.z));
/* 140:877 */     localJsonObject.addProperty("useRavines", Boolean.valueOf(parambgn.A));
/* 141:878 */     localJsonObject.addProperty("useWaterLakes", Boolean.valueOf(parambgn.B));
/* 142:879 */     localJsonObject.addProperty("waterLakeChance", Integer.valueOf(parambgn.C));
/* 143:880 */     localJsonObject.addProperty("useLavaLakes", Boolean.valueOf(parambgn.D));
/* 144:881 */     localJsonObject.addProperty("lavaLakeChance", Integer.valueOf(parambgn.E));
/* 145:882 */     localJsonObject.addProperty("useLavaOceans", Boolean.valueOf(parambgn.F));
/* 146:    */     
/* 147:884 */     localJsonObject.addProperty("fixedBiome", Integer.valueOf(parambgn.G));
/* 148:885 */     localJsonObject.addProperty("biomeSize", Integer.valueOf(parambgn.H));
/* 149:886 */     localJsonObject.addProperty("riverSize", Integer.valueOf(parambgn.I));
/* 150:    */     
/* 151:888 */     localJsonObject.addProperty("dirtSize", Integer.valueOf(parambgn.dirtRadius));
/* 152:889 */     localJsonObject.addProperty("dirtCount", Integer.valueOf(parambgn.dirtPerChunk));
/* 153:890 */     localJsonObject.addProperty("dirtMinHeight", Integer.valueOf(parambgn.L));
/* 154:891 */     localJsonObject.addProperty("dirtMaxHeight", Integer.valueOf(parambgn.M));
/* 155:892 */     localJsonObject.addProperty("gravelSize", Integer.valueOf(parambgn.N));
/* 156:893 */     localJsonObject.addProperty("gravelCount", Integer.valueOf(parambgn.O));
/* 157:894 */     localJsonObject.addProperty("gravelMinHeight", Integer.valueOf(parambgn.P));
/* 158:895 */     localJsonObject.addProperty("gravelMaxHeight", Integer.valueOf(parambgn.Q));
/* 159:896 */     localJsonObject.addProperty("graniteSize", Integer.valueOf(parambgn.R));
/* 160:897 */     localJsonObject.addProperty("graniteCount", Integer.valueOf(parambgn.S));
/* 161:898 */     localJsonObject.addProperty("graniteMinHeight", Integer.valueOf(parambgn.T));
/* 162:899 */     localJsonObject.addProperty("graniteMaxHeight", Integer.valueOf(parambgn.U));
/* 163:900 */     localJsonObject.addProperty("dioriteSize", Integer.valueOf(parambgn.V));
/* 164:901 */     localJsonObject.addProperty("dioriteCount", Integer.valueOf(parambgn.W));
/* 165:902 */     localJsonObject.addProperty("dioriteMinHeight", Integer.valueOf(parambgn.X));
/* 166:903 */     localJsonObject.addProperty("dioriteMaxHeight", Integer.valueOf(parambgn.Y));
/* 167:904 */     localJsonObject.addProperty("andesiteSize", Integer.valueOf(parambgn.Z));
/* 168:905 */     localJsonObject.addProperty("andesiteCount", Integer.valueOf(parambgn.aa));
/* 169:906 */     localJsonObject.addProperty("andesiteMinHeight", Integer.valueOf(parambgn.ab));
/* 170:907 */     localJsonObject.addProperty("andesiteMaxHeight", Integer.valueOf(parambgn.ac));
/* 171:908 */     localJsonObject.addProperty("coalSize", Integer.valueOf(parambgn.ad));
/* 172:909 */     localJsonObject.addProperty("coalCount", Integer.valueOf(parambgn.ae));
/* 173:910 */     localJsonObject.addProperty("coalMinHeight", Integer.valueOf(parambgn.af));
/* 174:911 */     localJsonObject.addProperty("coalMaxHeight", Integer.valueOf(parambgn.ag));
/* 175:912 */     localJsonObject.addProperty("ironSize", Integer.valueOf(parambgn.ah));
/* 176:913 */     localJsonObject.addProperty("ironCount", Integer.valueOf(parambgn.ai));
/* 177:914 */     localJsonObject.addProperty("ironMinHeight", Integer.valueOf(parambgn.aj));
/* 178:915 */     localJsonObject.addProperty("ironMaxHeight", Integer.valueOf(parambgn.ak));
/* 179:916 */     localJsonObject.addProperty("goldSize", Integer.valueOf(parambgn.al));
/* 180:917 */     localJsonObject.addProperty("goldCount", Integer.valueOf(parambgn.am));
/* 181:918 */     localJsonObject.addProperty("goldMinHeight", Integer.valueOf(parambgn.an));
/* 182:919 */     localJsonObject.addProperty("goldMaxHeight", Integer.valueOf(parambgn.ao));
/* 183:920 */     localJsonObject.addProperty("redstoneSize", Integer.valueOf(parambgn.redStoneRadius));
/* 184:921 */     localJsonObject.addProperty("redstoneCount", Integer.valueOf(parambgn.redstonePerChunk));
/* 185:922 */     localJsonObject.addProperty("redstoneMinHeight", Integer.valueOf(parambgn.redstoneY1));
/* 186:923 */     localJsonObject.addProperty("redstoneMaxHeight", Integer.valueOf(parambgn.redstoneY2));
/* 187:924 */     localJsonObject.addProperty("diamondSize", Integer.valueOf(parambgn.diamondRadius));
/* 188:925 */     localJsonObject.addProperty("diamondCount", Integer.valueOf(parambgn.diamondPerChunk));
/* 189:926 */     localJsonObject.addProperty("diamondMinHeight", Integer.valueOf(parambgn.diamondY1));
/* 190:927 */     localJsonObject.addProperty("diamondMaxHeight", Integer.valueOf(parambgn.diamondY2));
/* 191:928 */     localJsonObject.addProperty("lapisSize", Integer.valueOf(parambgn.lapisRadius));
/* 192:929 */     localJsonObject.addProperty("lapisCount", Integer.valueOf(parambgn.lapisPerChunk));
/* 193:930 */     localJsonObject.addProperty("lapisCenterHeight", Integer.valueOf(parambgn.az));
/* 194:931 */     localJsonObject.addProperty("lapisSpread", Integer.valueOf(parambgn.aA));
/* 195:    */     
/* 196:933 */     return localJsonObject;
/* 197:    */   }
/* 198:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bgo
 * JD-Core Version:    0.7.0.1
 */