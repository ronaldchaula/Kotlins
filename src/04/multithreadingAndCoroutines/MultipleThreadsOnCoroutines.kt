package `04`.multithreadingAndCoroutines

//A thread is a sequence fo execution
//Sequential programming means all instructions are executed in order
//Parallel programming means a set of instructions are executed in parallel
// * We can run tasks in parallel if they don't interact with each other, but the problem is in an app that has users using it, we get an issue here, now the App which has user interaction then we need to download or sending data without blocking the UI
// * EXAMPLE
// * 1. a user taps a button to download a music file //while the program is downloading a music file, then it will block the user from interacting with it
// * . when the program has completed the task, then the program gives control back to the user
// *
// * MULTITHREADED APPS
// * branching out the download process and allow user to continue doing something else when the app is downloading something
// * When the user has completed downloading the file then the control is joined back to the main thread which the UI is running on
// * multithreading should allow threads to synchronize
// should also allow errors to be handled
// *

//Coroutines vs. threads
//Are resource intensive, coroutines are lightweight threads.
//Consume a lot of memory while coroutines don't consume that much memory.
//Coroutines use thread pools.
//Simplify async code, callbacks, and synchronized.
//make parallel programming look like sequential programming.
//Coroutines use simple syntax.
//Can pause and resume at anytime on a number of threads.
//

/*
* COROUTINES IDEAS
* Scope creates and run coroutines, provides lifecycle events.
* Context the scope provides a context in which a coroutine runs.
* Suspending functions - functions that can run in a coroutines can be suspended.
* Jobs - a handle on a coroutines.
* Deferred a future result of a coroutine.
* Dispatcher - manages which threads the coroutines run on.
* Error handling.
* */