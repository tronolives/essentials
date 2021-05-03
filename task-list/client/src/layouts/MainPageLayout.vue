<template>
    <div class="flex justify-center items-center h-screen flex-col">
        <div class="flex-row">
            <AppButton class="m-4">Add New Task</AppButton>
            <AppButton class="m-4">Edit Tasks</AppButton>
        </div>
        <div>
            <TaskListView></TaskListView>
        </div>
    </div>
</template>
<script>
import AppButton from '@/components/SharedComponents/AppButton.vue';
import TaskListView from '@/components/MainPageComponents/TaskListView.vue';

export default {
    components: {
        AppButton,
        TaskListView
    }
}
</script>