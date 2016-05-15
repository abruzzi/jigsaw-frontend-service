$(function() {
    $('#search').on('click', function() {
        var input = $('#loginName').val();

        var basicTemplate = _.template($('#basic-info-template').text());
        var assignmentTemplate = _.template($('#assignment-template').text());

        $.get('/jigsaw/staffs/'+input).done(function(data) {
            $('#basic').html(basicTemplate({staff: data.staff}));
            $('#assignments').html(assignmentTemplate({assignments: data.assignments}));
        });
    })
});