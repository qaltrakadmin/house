package com.richmond.house

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.Schema
import com.expediagroup.graphql.server.operations.Mutation
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@GraphQLDescription("My schema description")
@Component
class MySchema : Schema

@GraphQLDescription("Widget")
data class Widget(val id: Int, val value: String)

@Component
class WidgetQuery : Query {
    @GraphQLDescription("Widget query")
    fun widget(): Widget {
        return Widget(1, "Hello world")
    }
}

@Component
class WidgetMutation : Mutation {
    @GraphQLDescription("create Widget mutation")
    fun createWidget(widget: Widget): Widget {
        return widget
    }
}