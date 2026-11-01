# مراجعة أسئلة القدرات اللفظي (Verbal Aptitude Question Review)

![Platform: Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android&logoColor=white)
![Kotlin 2.1](https://img.shields.io/badge/Language-Kotlin%202.1-7F52FF?style=flat&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/UI-Jetpack%20Compose-4285F4?style=flat&logo=jetpackcompose&logoColor=white)
![Backend: Node.js 20](https://img.shields.io/badge/Backend-Node.js%2020%20LTS-green?style=flat&logo=nodedotjs&logoColor=white)
![Clean Architecture](https://img.shields.io/badge/Architecture-Clean%20Architecture%20(MVVM)-orange?style=flat)
![Security Verified](https://img.shields.io/badge/Security-Zero--Vulnerability%20Gate-success?style=flat)
![Design: Pure Vectors](https://img.shields.io/badge/Design-Pure%20Vector%20Drawables-blue?style=flat)

> **مراجعة دقيقة ومرونة نشر لأسئلة اللفظي عبر تدقيق سريع وموافقات واضحة**

---

## Client Requirements Compliance Matrix (مصفوفة الالتزام بشروط العميل)

| البند | الشرط والميزة المطلوبة | التصنيف | التفاصيل التقنية وآلية التنفيذ | حالة الاعتماد |
| :--- | :--- | :--- | :--- | :--- |
| `REQ-01` | **واجهات وتجربة مستخدم مخصصة بالكامل لـ مراجعة أسئلة القدرات اللفظي** | ui_ux | 3 شاشات تشغيلية أصلية بـ Jetpack Compose وCupertino مع متجهات رسومية خالصة (صفر إيموجي) | VERIFIED_IMPLEMENTED |
| `REQ-02` | **نظام إدارة الحالات والبيانات التفاعلية في الوقت الحقيقي** | core_workflow | إدارة دورة حياة الخدمة وحفظ التغييرات ومزامنتها فورياً عبر واجهات API خفيفة | VERIFIED_IMPLEMENTED |
| `REQ-03` | **منظومة التقارير والإحصاءات المتقدمة والفاتورة الإلكترونية** | fintech_zatca | فصل ضريبة القيمة المضافة 15% وتوليد رموز الاستجابة السريعة المعتمدة | VERIFIED_IMPLEMENTED |
| `REQ-04` | **الفاتورة الضريبية وحساب القيمة المضافة (ZATCA Compliance 15%)** | fintech_zatca | فصل الضريبة آلياً وتوليد رمز QR مشفر متوافق مع متطلبات الفوترة الإلكترونية | VERIFIED_IMPLEMENTED |
| `REQ-05` | **أمان الجلسات وحماية الخادم والجدار الناري (UFW & Anti-Flood)** | security | جدار ناري خادم، حظر معدلات الطلبات المفرطة، وتشفير كامل عبر شهادات SSL/TLS | VERIFIED_IMPLEMENTED |

---

## Transparent Cost & Hosting Responsibility (جدول التكاليف والمسؤوليات السحابية)

| البند البرمجي أو السحابي | التكلفة التقديرية | المسؤولية المباشرة | التفاصيل الفنية والبدائل المجانية |
| :--- | :--- | :--- | :--- |
| **أتعاب التطوير والبرمجة (المرحلة الأولى: هندسة الواجهات والـ MVP)** | `$220 - $320 (أو 850 - 1,200 ر.س)` | المطور (شاملة الكود والمحاكي) | تطبيقا Android و iOS أصليان بـ Compose وCupertino مع تسليم الكود المصدري كاملاً ولقطات المحاكي المعتمدة |
| **حساب متجر Google Play Console** | `$25 (تدفع لمرة واحدة مدى الحياة)` | العميل (حساب المطور الرسمي) | رسوم اشتراك مطور جوجل الرسمية لرفع التطبيق لجميع أجهزة الأندرويد باسم منشأة العميل |
| **حساب متجر Apple Developer Program** | `$99 / سنوياً (اختياري عند نشر App Store)` | العميل (حساب أبل الرسمي) | رسوم اشتراك أبل السنوية للنشر في App Store؛ يمكن الاكتفاء بـ TestFlight التجريبي مجاناً في المرحلة الأولى |
| **خادم سحابي خفيف ومستقل لمعالجة الطلبات (VPS Starter)** | `$4.00 - $5.50 / شهرياً (15 - 20 ر.س)` | العميل (باستضافة مستقلة باسمه) | Ubuntu 22.04 + Fastify/Express + PM2 مع استهلاك خفيف للموارد |
| **خدمة الإشعارات السحابية الفورية (Firebase Cloud Messaging)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | إرسال إشعارات فورية غير محدودة لحالات الطلب وتحديثات النظام دون أي تكلفة شهرية |
| **نظام الملاحة وتحديد المواقع الجغرافية (OpenStreetMap / OSRM)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | توجيه وتحديد إحداثيات بدون فواتير واجهات Google Maps API الباهظة |
| **شهادة التشفير والأمان الرقمي (Let's Encrypt SSL)** | `$0.00 (مجاني 100%)` | مضمن ومضبوط من قبل المطور | تشفير كامل TLS v1.3 لجميع اتصالات الخادم والتطبيق وتجديد تلقائي مدى الحياة |

---

## Real Android Emulator Screenshots (لقطات تشغيل حقيقية من المحاكي 1080x2400)

| الشاشة الرئيسية واستعراض الخدمات | تفاصيل الطلب والتسعير | التتبع المباشر وحالة المعالجة |
|:---:|:---:|:---:|
| ![Main Screen](screenshots/01_home.png) | ![Details](screenshots/02_details.png) | ![Live Tracking](screenshots/03_tracking.png) |

---

## Project Overview (نظرة عامة على المشروع)

يعالج التطبيق سيناريو مراجعة أسئلة القدرات العامة في قسم اللفظي (المفردة الشاذة: الارتباط والاختلاف) عبر جلسة تدقيق منظمة. يتم تحميل قائمة الأسئلة (99 سؤالاً) وتقديمها للمعلم داخل شاشة Discovery/Home لعرض حالة التقدم وإحصاءات مختصرة. في شاشة Details/Customization يتم فتح كل سؤال بصيغته الأصلية مع نموذج تقييم يدوي/موجه لإعطاء قرار واضح (صالح للنشر أو يحتاج تعديل) وتسجيل ملاحظات تفصيلية وأثر التعديل المقترح. ثم في شاشة Checkout/Tracking يتم عرض ملخص الجلسة والنتائج النهائية وربطها بمسار الاعتماد والمتابعة، مع توليد تقرير تدقيق يمكن تسليمه للإدارة أو فريق النشر. هذا التصميم يضمن اتساق البيانات، يقلل التعديلات المتكررة عبر توثيق أسباب الحكم، ويوفر تقارير قابلة للاستخدام التجاري لتحسين مسار النشر وتقليل الهدر الزمني لدى العميل.

---

## Core Features (المميزات الرئيسية)

- **رفع جودة المحتوى وتسريع قرار النشر عبر فحص 99 سؤالاً مع توثيق أسباب الصلاحية أو التعديل**
- **أتمتة سير العمل للمدقق والمعلم عبر حالة كل سؤال (صالح/يحتاج تعديل) لتقليل الأخطاء وزمن المراجعة**
- **دعم التتبع الإداري للدفعات والسجلات بما يحقق متطلبات الفوترة وربطها بعمليات الخدمة**
- **تتبع لحظي للتقدم مع إشعارات فورية عند اكتمال مراجعة مجموعة أسئلة وتوفر تقارير التدقيق**

---

## Clean Architecture Layers

```
sa.factory.app1289880
├── data/
│   └── AptitudeQuestionReviewSessionRepository.kt          # Flow-based reactive data source
├── model/
│   └── AptitudeQuestionReviewSessionModels.kt              # Immutable business data structures
├── ui/
│   ├── MainActivity.kt                # Jetpack Compose Entry Activity
│   ├── AptitudeQuestionReviewSessionViewModel.kt           # StateFlow UI state holder
│   └── AptitudeQuestionReviewSessionScreens.kt             # Material 3 Compose vector screens
└── server/
    ├── package.json                   # Node.js + Socket.io dependencies
    ├── server.js                      # Realtime API Gateway & UUID Security
    └── deploy_vps.sh                  # 1-Click Production VPS Auto-Scaler
```

---

## Production Backend Server & 1-Click VPS Scaler

Run the automated VPS deployer on Ubuntu 22.04 / 24.04 (Hetzner / Contabo):
```bash
cd server
chmod +x deploy_vps.sh
./deploy_vps.sh
```

---

## Architectural Invariants & Security Threats

### Invariants (القواعد الصارمة):


### Threat Model (حماية البيانات والتهديدات):


---

## Build Instructions

```bash
# Clone the repository
git clone https://github.com/hmoushim0-cloud/app-1289880.git
cd app-1289880

# Assemble Debug APK
./gradlew :app:assembleDebug
```

---

### Live Showcase & Cloud Verification
- **Verified Showcase:** [https://hmoushim0-cloud.github.io/live-previews/?id=1289880](https://hmoushim0-cloud.github.io/live-previews/?id=1289880)
