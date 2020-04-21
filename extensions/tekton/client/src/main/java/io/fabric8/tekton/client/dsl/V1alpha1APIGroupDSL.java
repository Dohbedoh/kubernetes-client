/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.tekton.client.dsl;

import io.fabric8.kubernetes.client.Client;
import io.fabric8.kubernetes.client.dsl.MixedOperation;
import io.fabric8.kubernetes.client.dsl.NonNamespaceOperation;
import io.fabric8.kubernetes.client.dsl.Resource;
import io.fabric8.tekton.pipeline.v1alpha1.Condition;
import io.fabric8.tekton.pipeline.v1alpha1.ConditionList;
import io.fabric8.tekton.pipeline.v1alpha1.DoneableCondition;
import io.fabric8.tekton.pipeline.v1alpha1.ClusterTask;
import io.fabric8.tekton.pipeline.v1alpha1.ClusterTaskList;
import io.fabric8.tekton.pipeline.v1alpha1.DoneableClusterTask;
import io.fabric8.tekton.pipeline.v1alpha1.DoneablePipeline;
import io.fabric8.tekton.pipeline.v1alpha1.DoneablePipelineRun;
import io.fabric8.tekton.pipeline.v1alpha1.DoneableTask;
import io.fabric8.tekton.pipeline.v1alpha1.DoneableTaskRun;
import io.fabric8.tekton.pipeline.v1alpha1.Pipeline;
import io.fabric8.tekton.pipeline.v1alpha1.PipelineList;
import io.fabric8.tekton.pipeline.v1alpha1.PipelineRun;
import io.fabric8.tekton.pipeline.v1alpha1.PipelineRunList;
import io.fabric8.tekton.pipeline.v1alpha1.Task;
import io.fabric8.tekton.pipeline.v1alpha1.TaskList;
import io.fabric8.tekton.pipeline.v1alpha1.TaskRun;
import io.fabric8.tekton.pipeline.v1alpha1.TaskRunList;
import io.fabric8.tekton.resource.v1alpha1.DoneablePipelineResource;
import io.fabric8.tekton.resource.v1alpha1.PipelineResource;
import io.fabric8.tekton.resource.v1alpha1.PipelineResourceList;

public interface V1alpha1APIGroupDSL extends Client {
  MixedOperation<Pipeline, PipelineList, DoneablePipeline, Resource<Pipeline, DoneablePipeline>> pipelines();
  MixedOperation<PipelineRun, PipelineRunList, DoneablePipelineRun, Resource<PipelineRun, DoneablePipelineRun>> pipelineRuns();
  MixedOperation<PipelineResource, PipelineResourceList, DoneablePipelineResource, Resource<PipelineResource, DoneablePipelineResource>> pipelineResources();
  MixedOperation<Task, TaskList, DoneableTask, Resource<Task, DoneableTask>> tasks();
  MixedOperation<TaskRun, TaskRunList, DoneableTaskRun, Resource<TaskRun, DoneableTaskRun>> taskRuns();
  MixedOperation<Condition, ConditionList, DoneableCondition, Resource<Condition, DoneableCondition>> conditions();

  NonNamespaceOperation<ClusterTask, ClusterTaskList, DoneableClusterTask, Resource<ClusterTask, DoneableClusterTask>> clusterTasks();
}
