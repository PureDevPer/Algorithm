x_coefficient=[];
for i=10:16
    power = 2^i;
    x_coefficient = [x_coefficient power];
end


y_recursion = [7,5,7,19,41,92,190];
y_iteration = [3,5,8,17,38,76,171]; 


figure(1);
hold on; box on;
xlabel('Coefficient');
ylabel('Time (ms)');
%ylim([0.99 1.007]);
plot(x_coefficient, y_recursion, 'R--s', 'LineWidth', 8, 'MarkerSize', 16);
plot(x_coefficient, y_iteration, 'B--+', 'LineWidth', 8, 'MarkerSize', 16);
legend('Recursion', 'Iteration', 'Location', 'southeast');
kk = [2^10 2^11 2^12 2^13 2^14 2^15 2^16];
set(gca, 'XTick', kk);
set(gca, 'XTickLabel', {'2^1^0', '2^1^1', '2^1^2', '2^1^3', '2^1^4', '2^1^5', '2^1^6'});
set(gca, 'LineWidth', 2, 'FontSize', 30);
%filename = ['SampleDropRate_Average.eps'];
%saveas(gca, filename, 'epsc');
hold off;