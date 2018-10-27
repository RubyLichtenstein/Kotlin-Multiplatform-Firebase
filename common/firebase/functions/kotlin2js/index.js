(function (_, Kotlin, $module$kotlinx_coroutines_core, $module$kotlinx_serialization_runtime_js, $module$_google_cloud_firestore, $module$firebase_functions_lib_providers_firestore) {
  'use strict';
  var $$importsForInline$$ = _.$$importsForInline$$ || (_.$$importsForInline$$ = {});
  var coroutines = $module$kotlinx_coroutines_core.kotlinx.coroutines;
  var Throwable = Error;
  var Unit = Kotlin.kotlin.Unit;
  var COROUTINE_SUSPENDED = Kotlin.kotlin.coroutines.intrinsics.COROUTINE_SUSPENDED;
  var CoroutineImpl = Kotlin.kotlin.coroutines.CoroutineImpl;
  var launch = $module$kotlinx_coroutines_core.kotlinx.coroutines.launch_s496o7$;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var SerialClassDescImpl = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.internal.SerialClassDescImpl;
  var UnknownFieldException = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.UnknownFieldException;
  var KSerializer = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.KSerializer;
  var MissingFieldException = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.MissingFieldException;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var lazy = Kotlin.kotlin.lazy_klfg04$;
  var DocumentSnapshot = $module$_google_cloud_firestore.DocumentSnapshot;
  var throwCCE = Kotlin.throwCCE;
  var defineInlineFunction = Kotlin.defineInlineFunction;
  var wrapFunction = Kotlin.wrapFunction;
  var document = $module$firebase_functions_lib_providers_firestore.document;
  var await_0 = $module$kotlinx_coroutines_core.kotlinx.coroutines.await_t11jrl$;
  var promise = $module$kotlinx_coroutines_core.kotlinx.coroutines.promise_pda6u4$;
  var async = $module$kotlinx_coroutines_core.kotlinx.coroutines.async_pda6u4$;
  var asPromise = $module$kotlinx_coroutines_core.kotlinx.coroutines.asPromise_ge6odz$;
  var to = Kotlin.kotlin.to_ujzrz7$;
  var json = Kotlin.kotlin.js.json_pyyo18$;
  var Exception = Kotlin.kotlin.Exception;
  var Firestore = $module$_google_cloud_firestore.Firestore;
  PostsRepo.prototype = Object.create(Repo.prototype);
  PostsRepo.prototype.constructor = PostsRepo;
  function launchAndCatch$lambda(closure$function_0, closure$onError_0, closure$ret_0) {
    return function ($receiver, continuation_0, suspended) {
      var instance = new Coroutine$launchAndCatch$lambda(closure$function_0, closure$onError_0, closure$ret_0, $receiver, this, continuation_0);
      if (suspended)
        return instance;
      else
        return instance.doResume(null);
    };
  }
  function Coroutine$launchAndCatch$lambda(closure$function_0, closure$onError_0, closure$ret_0, $receiver, controller, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.$controller = controller;
    this.exceptionState_0 = 8;
    this.local$closure$function = closure$function_0;
    this.local$closure$onError = closure$onError_0;
    this.local$closure$ret = closure$ret_0;
  }
  Coroutine$launchAndCatch$lambda.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$launchAndCatch$lambda.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$launchAndCatch$lambda.prototype.constructor = Coroutine$launchAndCatch$lambda;
  Coroutine$launchAndCatch$lambda.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            var tmp$;
            this.exceptionState_0 = 3;
            this.state_0 = 1;
            this.result_0 = this.local$closure$function(this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            this.exceptionState_0 = 8;
            this.finallyPath_0 = [2];
            this.state_0 = 6;
            this.$returnValue = this.result_0;
            continue;
          case 2:
            return this.$returnValue;
          case 3:
            this.finallyPath_0 = [8];
            this.exceptionState_0 = 6;
            var e = this.exception_0;
            if (Kotlin.isType(e, Throwable)) {
              this.exceptionState_0 = 8;
              this.finallyPath_0 = [4];
              this.state_0 = 6;
              this.$returnValue = this.local$closure$onError(e);
              continue;
            }
             else {
              throw e;
            }

          case 4:
            return this.$returnValue;
          case 5:
            this.finallyPath_0 = [7];
            this.state_0 = 6;
            continue;
          case 6:
            (tmp$ = this.local$closure$ret.onFinally) != null ? tmp$() : null;
            this.state_0 = this.finallyPath_0.shift();
            continue;
          case 7:
            return;
          case 8:
            throw this.exception_0;
          default:this.state_0 = 8;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 8) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  function launchAndCatch(context, onError, function_0) {
    var ret = new Finalizable();
    launch(coroutines.GlobalScope, context, void 0, launchAndCatch$lambda(function_0, onError, ret));
    return ret;
  }
  function Finalizable() {
    this.onFinally = null;
  }
  Finalizable.prototype.finally_o14v8n$ = function (f) {
    this.onFinally = f;
  };
  Finalizable.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Finalizable',
    interfaces: []
  };
  function Post(id, content) {
    Post$Companion_getInstance();
    if (id === void 0)
      id = '';
    if (content === void 0)
      content = '';
    this.id = id;
    this.content = content;
  }
  function Post$Companion() {
    Post$Companion_instance = this;
  }
  Post$Companion.prototype.serializer = function () {
    return Post$$serializer_getInstance();
  };
  Post$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var Post$Companion_instance = null;
  function Post$Companion_getInstance() {
    if (Post$Companion_instance === null) {
      new Post$Companion();
    }
    return Post$Companion_instance;
  }
  function Post$$serializer() {
    this.descriptor_3z01r5$_0 = new SerialClassDescImpl('rubylich.ktmp.features.posts.Post');
    this.descriptor.addElement_ivxn3r$('id');
    this.descriptor.addElement_ivxn3r$('content');
    Post$$serializer_instance = this;
  }
  Object.defineProperty(Post$$serializer.prototype, 'descriptor', {
    get: function () {
      return this.descriptor_3z01r5$_0;
    }
  });
  Post$$serializer.prototype.serialize_awe97i$ = function (output_0, obj) {
    var output = output_0.beginStructure_r0sa6z$(this.descriptor, []);
    output.encodeStringElement_bgm7zs$(this.descriptor, 0, obj.id);
    output.encodeStringElement_bgm7zs$(this.descriptor, 1, obj.content);
    output.endStructure_qatsm0$(this.descriptor);
  };
  Post$$serializer.prototype.deserialize_nts5qn$ = function (input_0) {
    var index, readAll = false;
    var bitMask0 = 0;
    var local0
    , local1;
    var input = input_0.beginStructure_r0sa6z$(this.descriptor, []);
    loopLabel: while (true) {
      index = input.decodeElementIndex_qatsm0$(this.descriptor);
      switch (index) {
        case -2:
          readAll = true;
        case 0:
          local0 = input.decodeStringElement_3zr2iy$(this.descriptor, 0);
          bitMask0 |= 1;
          if (!readAll)
            break;
        case 1:
          local1 = input.decodeStringElement_3zr2iy$(this.descriptor, 1);
          bitMask0 |= 2;
          if (!readAll)
            break;
        case -1:
          break loopLabel;
        default:throw new UnknownFieldException(index);
      }
    }
    input.endStructure_qatsm0$(this.descriptor);
    return Post_init(bitMask0, local0, local1, null);
  };
  Post$$serializer.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: '$serializer',
    interfaces: [KSerializer]
  };
  var Post$$serializer_instance = null;
  function Post$$serializer_getInstance() {
    if (Post$$serializer_instance === null) {
      new Post$$serializer();
    }
    return Post$$serializer_instance;
  }
  function Post_init(seen, id, content, serializationConstructorMarker) {
    var $this = Object.create(Post.prototype);
    if ((seen & 1) === 0)
      throw new MissingFieldException('id');
    else
      $this.id = id;
    if ((seen & 2) === 0)
      throw new MissingFieldException('content');
    else
      $this.content = content;
    return $this;
  }
  Post.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Post',
    interfaces: []
  };
  Post.prototype.component1 = function () {
    return this.id;
  };
  Post.prototype.component2 = function () {
    return this.content;
  };
  Post.prototype.copy_puj7f4$ = function (id, content) {
    return new Post(id === void 0 ? this.id : id, content === void 0 ? this.content : content);
  };
  Post.prototype.toString = function () {
    return 'Post(id=' + Kotlin.toString(this.id) + (', content=' + Kotlin.toString(this.content)) + ')';
  };
  Post.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.content) | 0;
    return result;
  };
  Post.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.content, other.content)))));
  };
  function NotificationData() {
    NotificationData_instance = this;
    this.KEY_ID = 'id';
  }
  NotificationData.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'NotificationData',
    interfaces: []
  };
  var NotificationData_instance = null;
  function NotificationData_getInstance() {
    if (NotificationData_instance === null) {
      new NotificationData();
    }
    return NotificationData_instance;
  }
  function PostsNotification() {
    PostsNotification_instance = this;
    this.TOPIC = 'posts';
    this.ID = 'posts';
  }
  function PostsNotification$Data(id, postId, postContent, sound) {
    PostsNotification$Data$Companion_getInstance();
    if (id === void 0)
      id = PostsNotification_getInstance().ID;
    if (sound === void 0)
      sound = 'default';
    this.id = id;
    this.postId = postId;
    this.postContent = postContent;
    this.sound = sound;
  }
  function PostsNotification$Data$Companion() {
    PostsNotification$Data$Companion_instance = this;
  }
  PostsNotification$Data$Companion.prototype.serializer = function () {
    return PostsNotification$Data$$serializer_getInstance();
  };
  PostsNotification$Data$Companion.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Companion',
    interfaces: []
  };
  var PostsNotification$Data$Companion_instance = null;
  function PostsNotification$Data$Companion_getInstance() {
    if (PostsNotification$Data$Companion_instance === null) {
      new PostsNotification$Data$Companion();
    }
    return PostsNotification$Data$Companion_instance;
  }
  function PostsNotification$Data$$serializer() {
    this.descriptor_pa1yed$_0 = new SerialClassDescImpl('rubylich.ktmp.features.posts.PostsNotification.Data');
    this.descriptor.addElement_ivxn3r$('id');
    this.descriptor.addElement_ivxn3r$('postId');
    this.descriptor.addElement_ivxn3r$('postContent');
    this.descriptor.addElement_ivxn3r$('sound');
    PostsNotification$Data$$serializer_instance = this;
  }
  Object.defineProperty(PostsNotification$Data$$serializer.prototype, 'descriptor', {
    get: function () {
      return this.descriptor_pa1yed$_0;
    }
  });
  PostsNotification$Data$$serializer.prototype.serialize_awe97i$ = function (output_0, obj) {
    var output = output_0.beginStructure_r0sa6z$(this.descriptor, []);
    output.encodeStringElement_bgm7zs$(this.descriptor, 0, obj.id);
    output.encodeStringElement_bgm7zs$(this.descriptor, 1, obj.postId);
    output.encodeStringElement_bgm7zs$(this.descriptor, 2, obj.postContent);
    output.encodeStringElement_bgm7zs$(this.descriptor, 3, obj.sound);
    output.endStructure_qatsm0$(this.descriptor);
  };
  PostsNotification$Data$$serializer.prototype.deserialize_nts5qn$ = function (input_0) {
    var index, readAll = false;
    var bitMask0 = 0;
    var local0
    , local1
    , local2
    , local3;
    var input = input_0.beginStructure_r0sa6z$(this.descriptor, []);
    loopLabel: while (true) {
      index = input.decodeElementIndex_qatsm0$(this.descriptor);
      switch (index) {
        case -2:
          readAll = true;
        case 0:
          local0 = input.decodeStringElement_3zr2iy$(this.descriptor, 0);
          bitMask0 |= 1;
          if (!readAll)
            break;
        case 1:
          local1 = input.decodeStringElement_3zr2iy$(this.descriptor, 1);
          bitMask0 |= 2;
          if (!readAll)
            break;
        case 2:
          local2 = input.decodeStringElement_3zr2iy$(this.descriptor, 2);
          bitMask0 |= 4;
          if (!readAll)
            break;
        case 3:
          local3 = input.decodeStringElement_3zr2iy$(this.descriptor, 3);
          bitMask0 |= 8;
          if (!readAll)
            break;
        case -1:
          break loopLabel;
        default:throw new UnknownFieldException(index);
      }
    }
    input.endStructure_qatsm0$(this.descriptor);
    return PostsNotification$PostsNotification$Data_init(bitMask0, local0, local1, local2, local3, null);
  };
  PostsNotification$Data$$serializer.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: '$serializer',
    interfaces: [KSerializer]
  };
  var PostsNotification$Data$$serializer_instance = null;
  function PostsNotification$Data$$serializer_getInstance() {
    if (PostsNotification$Data$$serializer_instance === null) {
      new PostsNotification$Data$$serializer();
    }
    return PostsNotification$Data$$serializer_instance;
  }
  function PostsNotification$PostsNotification$Data_init(seen, id, postId, postContent, sound, serializationConstructorMarker) {
    var $this = Object.create(PostsNotification$Data.prototype);
    if ((seen & 1) === 0)
      throw new MissingFieldException('id');
    else
      $this.id = id;
    if ((seen & 2) === 0)
      throw new MissingFieldException('postId');
    else
      $this.postId = postId;
    if ((seen & 4) === 0)
      throw new MissingFieldException('postContent');
    else
      $this.postContent = postContent;
    if ((seen & 8) === 0)
      throw new MissingFieldException('sound');
    else
      $this.sound = sound;
    return $this;
  }
  PostsNotification$Data.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Data',
    interfaces: []
  };
  PostsNotification$Data.prototype.component1 = function () {
    return this.id;
  };
  PostsNotification$Data.prototype.component2 = function () {
    return this.postId;
  };
  PostsNotification$Data.prototype.component3 = function () {
    return this.postContent;
  };
  PostsNotification$Data.prototype.component4 = function () {
    return this.sound;
  };
  PostsNotification$Data.prototype.copy_w74nik$ = function (id, postId, postContent, sound) {
    return new PostsNotification$Data(id === void 0 ? this.id : id, postId === void 0 ? this.postId : postId, postContent === void 0 ? this.postContent : postContent, sound === void 0 ? this.sound : sound);
  };
  PostsNotification$Data.prototype.toString = function () {
    return 'Data(id=' + Kotlin.toString(this.id) + (', postId=' + Kotlin.toString(this.postId)) + (', postContent=' + Kotlin.toString(this.postContent)) + (', sound=' + Kotlin.toString(this.sound)) + ')';
  };
  PostsNotification$Data.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.id) | 0;
    result = result * 31 + Kotlin.hashCode(this.postId) | 0;
    result = result * 31 + Kotlin.hashCode(this.postContent) | 0;
    result = result * 31 + Kotlin.hashCode(this.sound) | 0;
    return result;
  };
  PostsNotification$Data.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.id, other.id) && Kotlin.equals(this.postId, other.postId) && Kotlin.equals(this.postContent, other.postContent) && Kotlin.equals(this.sound, other.sound)))));
  };
  PostsNotification.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'PostsNotification',
    interfaces: []
  };
  var PostsNotification_instance = null;
  function PostsNotification_getInstance() {
    if (PostsNotification_instance === null) {
      new PostsNotification();
    }
    return PostsNotification_instance;
  }
  var REF_POSTS;
  function IPostRepo() {
  }
  IPostRepo.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'IPostRepo',
    interfaces: [IRepo]
  };
  function PostsRepo() {
    Repo.call(this, REF_POSTS, new PostParser());
  }
  PostsRepo.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'PostsRepo',
    interfaces: [IPostRepo, Repo]
  };
  function IRepo() {
  }
  IRepo.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'IRepo',
    interfaces: []
  };
  function Parser() {
  }
  Parser.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Parser',
    interfaces: []
  };
  function functions$lambda() {
    return require('firebase-functions');
  }
  var functions;
  function get_functions() {
    return functions.value;
  }
  function firebaseAdmin$lambda() {
    return require('firebase-admin');
  }
  var firebaseAdmin;
  function get_firebaseAdmin() {
    return firebaseAdmin.value;
  }
  function main(args) {
    adminInitializeApp();
    exports.dbPostsOnCreate = dbPostsOnCreate();
  }
  function PostParser() {
  }
  var DynamicObjectParser_init = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.DynamicObjectParser;
  var getKClass = Kotlin.getKClass;
  var getOrDefault = $module$kotlinx_serialization_runtime_js.kotlinx.serialization.context.getOrDefault_6qy6ah$;
  PostParser.prototype.parse_za3rmp$ = function (any) {
    var tmp$;
    var $receiver = Kotlin.isType(tmp$ = any, DocumentSnapshot) ? tmp$ : throwCCE();
    var $this = new DynamicObjectParser_init();
    var obj = $receiver.data();
    return $this.parse_tf9272$(obj, getOrDefault($this.context, getKClass(Post)));
  };
  PostParser.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'PostParser',
    interfaces: [Parser]
  };
  var parse = defineInlineFunction('index.rubylich.ktmp.features.posts.parse_we1qee$', wrapFunction(function () {
    var DynamicObjectParser_init = _.$$importsForInline$$['kotlinx-serialization-runtime-js'].kotlinx.serialization.DynamicObjectParser;
    var getKClass = Kotlin.getKClass;
    var getOrDefault = _.$$importsForInline$$['kotlinx-serialization-runtime-js'].kotlinx.serialization.context.getOrDefault_6qy6ah$;
    return function (T_0, isT, $receiver) {
      var $this = new DynamicObjectParser_init();
      var obj = $receiver.data();
      return $this.parse_tf9272$(obj, getOrDefault($this.context, getKClass(T_0)));
    };
  }));
  function dbPostsOnCreate$lambda$lambda(closure$postsRepo_0, closure$postId_0) {
    return function ($receiver, continuation_0, suspended) {
      var instance = new Coroutine$dbPostsOnCreate$lambda$lambda(closure$postsRepo_0, closure$postId_0, $receiver, this, continuation_0);
      if (suspended)
        return instance;
      else
        return instance.doResume(null);
    };
  }
  function Coroutine$dbPostsOnCreate$lambda$lambda(closure$postsRepo_0, closure$postId_0, $receiver, controller, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.$controller = controller;
    this.exceptionState_0 = 1;
    this.local$closure$postsRepo = closure$postsRepo_0;
    this.local$closure$postId = closure$postId_0;
  }
  Coroutine$dbPostsOnCreate$lambda$lambda.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$dbPostsOnCreate$lambda$lambda.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$dbPostsOnCreate$lambda$lambda.prototype.constructor = Coroutine$dbPostsOnCreate$lambda$lambda;
  Coroutine$dbPostsOnCreate$lambda$lambda.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = this.local$closure$postsRepo.get_61zpoe$(this.local$closure$postId, this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            var post = this.result_0;
            this.state_0 = 3;
            this.result_0 = await_0(sendDataNotificationToTopic(PostsNotification_getInstance().TOPIC, new PostsNotification$Data(void 0, post.id, post.content)), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 3:
            return this.result_0;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  function dbPostsOnCreate$lambda(snapshot, context) {
    var tmp$;
    var postId = typeof (tmp$ = context.params['id']) === 'string' ? tmp$ : throwCCE();
    var postsRepo = new PostsRepo();
    return promise(coroutines.GlobalScope, void 0, void 0, dbPostsOnCreate$lambda$lambda(postsRepo, postId));
  }
  function dbPostsOnCreate() {
    return document('/posts/{id}').onCreate(dbPostsOnCreate$lambda);
  }
  var PARAM_USER_ID;
  function dbPostsOnDelete$lambda$lambda($receiver, continuation_0, suspended) {
    var instance = new Coroutine$dbPostsOnDelete$lambda$lambda($receiver, this, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  }
  function Coroutine$dbPostsOnDelete$lambda$lambda($receiver, controller, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.$controller = controller;
    this.exceptionState_0 = 1;
  }
  Coroutine$dbPostsOnDelete$lambda$lambda.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$dbPostsOnDelete$lambda$lambda.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$dbPostsOnDelete$lambda$lambda.prototype.constructor = Coroutine$dbPostsOnDelete$lambda$lambda;
  Coroutine$dbPostsOnDelete$lambda$lambda.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            return Unit;
          case 1:
            throw this.exception_0;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  function dbPostsOnDelete$lambda(snapshot, context) {
    return asPromise(async(coroutines.GlobalScope, void 0, void 0, dbPostsOnDelete$lambda$lambda));
  }
  function dbPostsOnDelete() {
    return get_functions().firestore.document('/posts/{id}').onDelete(dbPostsOnDelete$lambda);
  }
  function adminInitializeApp() {
    try {
      var firebaseApp = get_firebaseAdmin().initializeApp(get_functions().config().firebase);
      var api = firebaseApp.firestore();
      api.settings(json([to('timestampsInSnapshots', true)]));
    }
     catch (e) {
      if (!Kotlin.isType(e, Exception))
        throw e;
    }
  }
  function defaultNotificationOptions() {
    return json([to('priority', 'high'), to('timeToLive', 86400)]);
  }
  function sendDataNotificationToTopic$lambda(value) {
    console.log('MessagingTopicResponse messageId: ' + JSON.stringify(value));
    return Unit;
  }
  function sendDataNotificationToTopic(topic, payload, options) {
    if (options === void 0)
      options = defaultNotificationOptions();
    var payloadJson = json([to('data', payload)]);
    console.log('sendDataNotificationToTopic, topic: ' + topic + ', payload: ' + JSON.stringify(payload) + ', options: ' + JSON.stringify(options));
    return get_firebaseAdmin().messaging().sendToTopic(topic, payloadJson, options).then(sendDataNotificationToTopic$lambda);
  }
  function sendDataNotificationToDevice$lambda(value) {
    console.log('MessagingDevicesResponse messageId: ' + JSON.stringify(value));
    return Unit;
  }
  function sendDataNotificationToDevice(registrationToken, payload, options) {
    if (options === void 0)
      options = defaultNotificationOptions();
    console.log('sendDataNotificationToDevice, registrationToken: ' + registrationToken + ', payload: ' + JSON.stringify(payload) + ', options: ' + JSON.stringify(options));
    return get_firebaseAdmin().messaging().sendToDevice(registrationToken, json([to('data', payload)]), options).then(sendDataNotificationToDevice$lambda);
  }
  function Repo(ref, parser) {
    this.parser_hd5lxx$_0 = parser;
    this.collection_wsrzsk$_0 = (new Firestore()).collection(ref);
  }
  Repo.prototype.get_61zpoe$ = function (id_0, continuation_0, suspended) {
    var instance = new Coroutine$get_61zpoe$(this, id_0, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  };
  function Coroutine$get_61zpoe$($this, id_0, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.exceptionState_0 = 1;
    this.$this = $this;
    this.local$id = id_0;
  }
  Coroutine$get_61zpoe$.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$get_61zpoe$.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$get_61zpoe$.prototype.constructor = Coroutine$get_61zpoe$;
  Coroutine$get_61zpoe$.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = await_0(this.$this.collection_wsrzsk$_0.doc(this.local$id).get(), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            var documentSnapshot = this.result_0;
            return this.$this.parser_hd5lxx$_0.parse_za3rmp$(documentSnapshot);
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  Repo.prototype.set_qxeam9$ = function (id_0, t_0, continuation_0, suspended) {
    var instance = new Coroutine$set_qxeam9$(this, id_0, t_0, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  };
  function Coroutine$set_qxeam9$($this, id_0, t_0, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.exceptionState_0 = 1;
    this.$this = $this;
    this.local$id = id_0;
    this.local$t = t_0;
  }
  Coroutine$set_qxeam9$.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$set_qxeam9$.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$set_qxeam9$.prototype.constructor = Coroutine$set_qxeam9$;
  Coroutine$set_qxeam9$.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = await_0(this.$this.collection_wsrzsk$_0.doc(this.local$id).set(this.local$t), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            return;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  Repo.prototype.delete_61zpoe$ = function (id_0, continuation_0, suspended) {
    var instance = new Coroutine$delete_61zpoe$(this, id_0, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  };
  function Coroutine$delete_61zpoe$($this, id_0, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.exceptionState_0 = 1;
    this.$this = $this;
    this.local$id = id_0;
  }
  Coroutine$delete_61zpoe$.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$delete_61zpoe$.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$delete_61zpoe$.prototype.constructor = Coroutine$delete_61zpoe$;
  Coroutine$delete_61zpoe$.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = await_0(this.$this.collection_wsrzsk$_0.doc(this.local$id).delete(), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            return;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  Repo.prototype.update_rjah4r$ = function (id_0, field_0, value_0, continuation_0, suspended) {
    var instance = new Coroutine$update_rjah4r$(this, id_0, field_0, value_0, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  };
  function Coroutine$update_rjah4r$($this, id_0, field_0, value_0, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.exceptionState_0 = 1;
    this.$this = $this;
    this.local$id = id_0;
    this.local$field = field_0;
    this.local$value = value_0;
  }
  Coroutine$update_rjah4r$.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$update_rjah4r$.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$update_rjah4r$.prototype.constructor = Coroutine$update_rjah4r$;
  Coroutine$update_rjah4r$.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = await_0(this.$this.collection_wsrzsk$_0.doc(this.local$id).update(this.local$field, this.local$value), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            return;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  Repo.prototype.getAll = function (continuation_0, suspended) {
    var instance = new Coroutine$getAll(this, continuation_0);
    if (suspended)
      return instance;
    else
      return instance.doResume(null);
  };
  function Coroutine$getAll($this, continuation_0) {
    CoroutineImpl.call(this, continuation_0);
    this.exceptionState_0 = 1;
    this.$this = $this;
  }
  Coroutine$getAll.$metadata$ = {
    kind: Kotlin.Kind.CLASS,
    simpleName: null,
    interfaces: [CoroutineImpl]
  };
  Coroutine$getAll.prototype = Object.create(CoroutineImpl.prototype);
  Coroutine$getAll.prototype.constructor = Coroutine$getAll;
  Coroutine$getAll.prototype.doResume = function () {
    do
      try {
        switch (this.state_0) {
          case 0:
            this.state_0 = 2;
            this.result_0 = await_0(this.$this.collection_wsrzsk$_0.get(), this);
            if (this.result_0 === COROUTINE_SUSPENDED)
              return COROUTINE_SUSPENDED;
            continue;
          case 1:
            throw this.exception_0;
          case 2:
            var $receiver = this.result_0.docs;
            var destination = ArrayList_init($receiver.length);
            var tmp$;
            for (tmp$ = 0; tmp$ !== $receiver.length; ++tmp$) {
              var item = $receiver[tmp$];
              destination.add_11rb$(this.$this.parser_hd5lxx$_0.parse_za3rmp$(item));
            }

            return destination;
          default:this.state_0 = 1;
            throw new Error('State Machine Unreachable execution');
        }
      }
       catch (e) {
        if (this.state_0 === 1) {
          this.exceptionState_0 = this.state_0;
          throw e;
        }
         else {
          this.state_0 = this.exceptionState_0;
          this.exception_0 = e;
        }
      }
     while (true);
  };
  Repo.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Repo',
    interfaces: [IRepo]
  };
  var package$rubylich = _.rubylich || (_.rubylich = {});
  var package$ktmp = package$rubylich.ktmp || (package$rubylich.ktmp = {});
  package$ktmp.launchAndCatch_tjb5ek$ = launchAndCatch;
  package$ktmp.Finalizable = Finalizable;
  Object.defineProperty(Post, 'Companion', {
    get: Post$Companion_getInstance
  });
  Object.defineProperty(Post, '$serializer', {
    get: Post$$serializer_getInstance
  });
  var package$features = package$ktmp.features || (package$ktmp.features = {});
  var package$posts = package$features.posts || (package$features.posts = {});
  package$posts.Post = Post;
  Object.defineProperty(package$posts, 'NotificationData', {
    get: NotificationData_getInstance
  });
  Object.defineProperty(PostsNotification$Data, 'Companion', {
    get: PostsNotification$Data$Companion_getInstance
  });
  Object.defineProperty(PostsNotification$Data, '$serializer', {
    get: PostsNotification$Data$$serializer_getInstance
  });
  PostsNotification.prototype.Data = PostsNotification$Data;
  Object.defineProperty(package$posts, 'PostsNotification', {
    get: PostsNotification_getInstance
  });
  Object.defineProperty(package$posts, 'REF_POSTS', {
    get: function () {
      return REF_POSTS;
    }
  });
  package$posts.IPostRepo = IPostRepo;
  package$posts.PostsRepo = PostsRepo;
  var package$repo = package$ktmp.repo || (package$ktmp.repo = {});
  package$repo.IRepo = IRepo;
  package$repo.Parser = Parser;
  Object.defineProperty(_, 'functions', {
    get: get_functions
  });
  Object.defineProperty(_, 'firebaseAdmin', {
    get: get_firebaseAdmin
  });
  _.main_kand9s$ = main;
  $$importsForInline$$.index = _;
  package$posts.PostParser = PostParser;
  $$importsForInline$$['kotlinx-serialization-runtime-js'] = $module$kotlinx_serialization_runtime_js;
  var package$functions = package$ktmp.functions || (package$ktmp.functions = {});
  var package$db = package$functions.db || (package$functions.db = {});
  var package$posts_0 = package$db.posts || (package$db.posts = {});
  package$posts_0.dbPostsOnCreate = dbPostsOnCreate;
  Object.defineProperty(package$posts_0, 'PARAM_USER_ID', {
    get: function () {
      return PARAM_USER_ID;
    }
  });
  package$posts_0.dbPostsOnDelete = dbPostsOnDelete;
  var package$lib = package$functions.lib || (package$functions.lib = {});
  package$lib.adminInitializeApp = adminInitializeApp;
  package$lib.defaultNotificationOptions = defaultNotificationOptions;
  package$lib.sendDataNotificationToTopic_z7cx7j$ = sendDataNotificationToTopic;
  package$lib.sendDataNotificationToDevice_z7cx7j$ = sendDataNotificationToDevice;
  package$repo.Repo = Repo;
  Post$$serializer.prototype.patch_mynpiu$ = KSerializer.prototype.patch_mynpiu$;
  PostsNotification$Data$$serializer.prototype.patch_mynpiu$ = KSerializer.prototype.patch_mynpiu$;
  REF_POSTS = 'posts';
  functions = lazy(functions$lambda);
  firebaseAdmin = lazy(firebaseAdmin$lambda);
  PARAM_USER_ID = 'userId';
  main([]);
  Kotlin.defineModule('index', _);
  return _;
}(module.exports, require('kotlin'), require('./kotlinx-coroutines-core'), require('kotlinx-serialization-runtime-js'), require('@google-cloud/firestore'), require('firebase-functions/lib/providers/firestore')));

//# sourceMappingURL=index.js.map
