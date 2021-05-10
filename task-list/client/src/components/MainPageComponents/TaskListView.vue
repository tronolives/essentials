<template>
    <div class=" border border-gray-800 h-20 w-20">

    </div>
</template>
<script>
import TaskService from '@/services/taskService.js'

export default {
    methods: {
        getTasks: () => {
            
        }
    },
    mounted: () => {
        TaskService.getAllTasks()
    }
}

</script>
 