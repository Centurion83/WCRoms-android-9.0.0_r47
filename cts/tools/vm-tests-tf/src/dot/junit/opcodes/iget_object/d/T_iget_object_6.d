; Copyright (C) 2008 The Android Open Source Project
;
; Licensed under the Apache License, Version 2.0 (the "License");
; you may not use this file except in compliance with the License.
; You may obtain a copy of the License at
;
;      http://www.apache.org/licenses/LICENSE-2.0
;
; Unless required by applicable law or agreed to in writing, software
; distributed under the License is distributed on an "AS IS" BASIS,
; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
; See the License for the specific language governing permissions and
; limitations under the License.

.source T_iget_object_6.java
.class public dot.junit.opcodes.iget_object.d.T_iget_object_6
.super java/lang/Object


.method public <init>()V
.limit regs 1

       invoke-direct {v0}, java/lang/Object/<init>()V
       return-void
.end method

.method public run()Ljava/lang/Object;
.limit regs 3

       new-instance v0, Ldot/junit/opcodes/iget_object/TestStubs;
       invoke-direct {v0}, dot/junit/opcodes/iget_object/TestStubs/<init>()V

       iget-object v1, v0, dot.junit.opcodes.iget_object.TestStubs.TestStubField Ljava/lang/Object;
       return-object v1
.end method


