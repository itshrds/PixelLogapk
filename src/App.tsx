/**
 * @license
 * SPDX-License-Identifier: Apache-2.0
 */

/**
 * @license
 * SPDX-License-Identifier: Apache-2.0
 */

import { Wifi, ShieldCheck, Smartphone, CheckCircle } from 'lucide-react';

export default function App() {
  return (
    <div className="min-h-screen bg-neutral-950 text-white flex flex-col items-center justify-center p-6 selection:bg-indigo-500 selection:text-white">
      <div className="max-w-md w-full bg-neutral-900 border border-neutral-800 rounded-3xl p-8 shadow-2xl relative overflow-hidden">
        {/* Glow effect */}
        <div className="absolute -top-24 -right-24 w-48 h-48 bg-indigo-500/10 rounded-full blur-3xl pointer-events-none" />
        
        <div className="flex items-center gap-3 mb-6">
          <div className="w-12 h-12 rounded-2xl bg-indigo-600/20 border border-indigo-500/30 flex items-center justify-center text-indigo-400">
            <Smartphone size={24} />
          </div>
          <div>
            <h1 className="text-xl font-bold tracking-tight">تطبيق الأندرويد جاهز</h1>
            <p className="text-sm text-neutral-400">Android APK Ready</p>
          </div>
        </div>

        <div className="space-y-4 mb-8">
          <div className="flex items-start gap-3 p-4 rounded-2xl bg-neutral-950 border border-neutral-800/80">
            <div className="p-2 rounded-xl bg-emerald-500/10 text-emerald-400 mt-0.5">
              <Wifi size={18} />
            </div>
            <div>
              <h2 className="text-sm font-semibold text-neutral-200">صلاحية الإنترنت مفعّلة</h2>
              <p className="text-xs text-neutral-400 mt-0.5">
                تمت إضافة <code className="text-indigo-400 font-mono">android.permission.INTERNET</code> بنجاح في ملف Manifest وتكوينات Capacitor.
              </p>
            </div>
          </div>

          <div className="flex items-start gap-3 p-4 rounded-2xl bg-neutral-950 border border-neutral-800/80">
            <div className="p-2 rounded-xl bg-indigo-500/10 text-indigo-400 mt-0.5">
              <ShieldCheck size={18} />
            </div>
            <div>
              <h2 className="text-sm font-semibold text-neutral-200">جاهز للبناء (Build)</h2>
              <p className="text-xs text-neutral-400 mt-0.5">
                يمكنك الآن بناء تطبيق الـ APK الخاص بك مع ضمان الاتصال الكامل بالشبكة.
              </p>
            </div>
          </div>
        </div>

        <div className="flex items-center justify-center gap-2 text-xs text-neutral-500 pt-4 border-t border-neutral-800">
          <CheckCircle size={14} className="text-emerald-500" />
          <span>تم الحفاظ على باقي الكود بالكامل</span>
        </div>
      </div>
    </div>
  );
}

